package com.gomdolstudio.covidinfoapp.ui

import androidx.lifecycle.*
import com.gomdolstudio.covidinfoapp.data.CasesLocation
import com.gomdolstudio.covidinfoapp.data.Item
import com.gomdolstudio.covidinfoapp.data.NewsItems
import com.gomdolstudio.covidinfoapp.data.service.CasesLocationService
import com.gomdolstudio.covidinfoapp.data.service.NewsService
import com.gomdolstudio.covidinfoapp.di.factory.AssistedSavedStateViewModelFactory
import com.gomdolstudio.covidinfoapp.util.convertMarkDownToString
import com.squareup.inject.assisted.Assisted
import com.squareup.inject.assisted.AssistedInject
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import java.time.LocalDate

class NewsViewModel @AssistedInject constructor(@Assisted private val savedStateHandle: SavedStateHandle,
                                                 private val newsService: NewsService): ViewModel() {
    private val compositeDisposable = CompositeDisposable()
    private var liveNewsItems: MutableLiveData<NewsItems> = MutableLiveData()
    private var news_title_1: LiveData<String> = Transformations.map(liveNewsItems){ liveNews -> convertMarkDownToString(liveNews.items.get(0).title) }
    private var news_title_2: LiveData<String> = Transformations.map(liveNewsItems){ liveNews -> convertMarkDownToString(liveNews.items.get(1).title) }
    private var news_title_3: LiveData<String> = Transformations.map(liveNewsItems){ liveNews -> convertMarkDownToString(liveNews.items.get(2).title) }
    private var news_title_4: LiveData<String> = Transformations.map(liveNewsItems){ liveNews -> convertMarkDownToString(liveNews.items.get(3).title)}

    @AssistedInject.Factory
    interface Factory : AssistedSavedStateViewModelFactory<NewsViewModel>

    fun loadNews() {
        compositeDisposable.add(newsService.getNews("코로나백신접종",10,1,"sim")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(liveNewsItems::setValue))

    }

    fun getLiveNews(): MutableLiveData<NewsItems> {
        return liveNewsItems
    }

    fun getNewsTitle1(): LiveData<String>{
        return news_title_1
    }
    fun getNewsTitle2(): LiveData<String>{
        return news_title_2
    }
    fun getNewsTitle3(): LiveData<String>{
        return news_title_3
    }
    fun getNewsTitle4(): LiveData<String>{
        return news_title_4
    }


}