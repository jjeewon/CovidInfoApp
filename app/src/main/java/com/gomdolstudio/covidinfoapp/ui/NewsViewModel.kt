package com.gomdolstudio.covidinfoapp.ui

import androidx.lifecycle.*
import com.gomdolstudio.covidinfoapp.data.CasesLocation
import com.gomdolstudio.covidinfoapp.data.Item
import com.gomdolstudio.covidinfoapp.data.NewsItems
import com.gomdolstudio.covidinfoapp.data.service.CasesLocationService
import com.gomdolstudio.covidinfoapp.data.service.NewsService
import com.gomdolstudio.covidinfoapp.di.factory.AssistedSavedStateViewModelFactory
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
    private var news: LiveData<String> = Transformations.map(liveNewsItems){ liveNews -> liveNews.items.get(0).title }

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

    fun getNews(): LiveData<String>{
        return news
    }


}