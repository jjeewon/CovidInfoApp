package com.gomdolstudio.covidinfoapp.ui

import androidx.lifecycle.*
import com.gomdolstudio.covidinfoapp.Tokens
import com.gomdolstudio.covidinfoapp.data.CasesLocation
import com.gomdolstudio.covidinfoapp.data.service.CasesLocationService
import com.gomdolstudio.covidinfoapp.di.factory.AssistedSavedStateViewModelFactory
import com.squareup.inject.assisted.Assisted
import com.squareup.inject.assisted.AssistedInject
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import java.time.LocalDate
import javax.xml.transform.TransformerFactory

class CasesViewModel @AssistedInject constructor(@Assisted private val savedStateHandle: SavedStateHandle,
                                                 private val casesLocationService: CasesLocationService): ViewModel() {
    private val compositeDisposable = CompositeDisposable()
    private var liveCases: MutableLiveData<CasesLocation> = MutableLiveData()

    private var seoul_case: LiveData<String> = Transformations.map(liveCases){ liveCases -> liveCases.data.get(1).firstCnt.toString() }
    private var busan_case: LiveData<String> = Transformations.map(liveCases){ liveCases -> liveCases.data.get(2).firstCnt.toString() }
    private var daegoo_case: LiveData<String> = Transformations.map(liveCases){ liveCases -> liveCases.data.get(3).firstCnt.toString() }
    private var kwangjoo_case: LiveData<String> = Transformations.map(liveCases){ liveCases -> liveCases.data.get(4).firstCnt.toString() }
    private var incheon_case: LiveData<String> = Transformations.map(liveCases){ liveCases -> liveCases.data.get(5).firstCnt.toString() }
    private var daejeon_case: LiveData<String> = Transformations.map(liveCases){ liveCases -> liveCases.data.get(6).firstCnt.toString() }
    private var ulsan_case: LiveData<String> = Transformations.map(liveCases){ liveCases -> liveCases.data.get(7).firstCnt.toString() }
    private var sejong_case: LiveData<String> = Transformations.map(liveCases){ liveCases -> liveCases.data.get(8).firstCnt.toString() }
    private var gyeongi_case: LiveData<String> = Transformations.map(liveCases){ liveCases -> liveCases.data.get(9).firstCnt.toString() }
    private var kangwon_case: LiveData<String> = Transformations.map(liveCases){ liveCases -> liveCases.data.get(10).firstCnt.toString() }
    private var chungbuk_case: LiveData<String> = Transformations.map(liveCases){ liveCases -> liveCases.data.get(11).firstCnt.toString() }
    private var chungnam_case: LiveData<String> = Transformations.map(liveCases){ liveCases -> liveCases.data.get(12).firstCnt.toString() }
    private var jeonbuk_case: LiveData<String> = Transformations.map(liveCases){ liveCases -> liveCases.data.get(13).firstCnt.toString() }
    private var jeonnam_case: LiveData<String> = Transformations.map(liveCases){ liveCases -> liveCases.data.get(14).firstCnt.toString() }
    private var gyeongbuk_case: LiveData<String> = Transformations.map(liveCases){ liveCases -> liveCases.data.get(15).firstCnt.toString() }
    private var gyeongnam_case: LiveData<String> = Transformations.map(liveCases){ liveCases -> liveCases.data.get(16).firstCnt.toString() }
    private var jeju_case: LiveData<String> = Transformations.map(liveCases){ liveCases -> liveCases.data.get(17).firstCnt.toString() }

    @AssistedInject.Factory
    interface Factory : AssistedSavedStateViewModelFactory<CasesViewModel>

    fun loadCases(){
        compositeDisposable.add(casesLocationService.getCasesLocation("1","20",Tokens.VACCINE_SERVICE_KEY,LocalDate.now().toString()+" 00:00:00")
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(liveCases::setValue))
    }

    fun getLiveCases(): MutableLiveData<CasesLocation>{ return liveCases }
    fun getSeoulCase(): LiveData<String>{ return seoul_case }
    fun getBusanCase(): LiveData<String>{ return busan_case }
    fun getDaegooCase(): LiveData<String>{ return daegoo_case }
    fun getKwangjooCase(): LiveData<String>{ return kwangjoo_case }
    fun getIncheonCase(): LiveData<String>{ return incheon_case }
    fun getDaejeonCase(): LiveData<String>{ return daejeon_case }
    fun getUlsanCase(): LiveData<String>{ return ulsan_case }
    fun getSejongCase(): LiveData<String>{ return sejong_case }
    fun getGyengiCase(): LiveData<String>{ return gyeongi_case }
    fun getKangwonCase(): LiveData<String>{ return kangwon_case }
    fun getChungbukCase(): LiveData<String>{ return chungbuk_case }
    fun getChungnamCase(): LiveData<String>{ return chungnam_case }
    fun getJeonbukCase(): LiveData<String>{ return jeonbuk_case }
    fun getJeonnamCase(): LiveData<String>{ return jeonnam_case }
    fun getGyeonbukCase(): LiveData<String>{ return gyeongbuk_case }
    fun getGyeongnamCase(): LiveData<String>{ return gyeongnam_case }
    fun getJejuCase(): LiveData<String>{ return jeju_case }
}