package com.gomdolstudio.covidinfoapp

import com.gomdolstudio.covidinfoapp.data.service.VaccinationCenterService
import com.gomdolstudio.covidinfoapp.data.service.CasesLocationService
import com.gomdolstudio.covidinfoapp.data.service.NewsService
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import org.junit.Before
import org.junit.Test
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class DataTest {
    lateinit var vaccinationCenterService: VaccinationCenterService
    lateinit var casesLocationService: CasesLocationService
    lateinit var newsService: NewsService
    @Before
    fun 데이터서비스세팅(){
        vaccinationCenterService = Retrofit.Builder()
            .baseUrl("https://api.odcloud.kr/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build().create(VaccinationCenterService::class.java)

        casesLocationService = Retrofit.Builder()
            .baseUrl("https://api.odcloud.kr/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build().create(CasesLocationService::class.java)

        newsService = Retrofit.Builder()
                .baseUrl("https://openapi.naver.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build().create(NewsService::class.java)
    }
    @Test
    fun 백신센터데이터테스트(){
        vaccinationCenterService.getVaccinationCenter("1","10","qMYuD3Bao+aVVtqIcLH1sqz80i+otqoifcU1C7frDT+SVjQD9FXw8uT1CqYcME+q+A8YKoiZns1FXGGgJVwVzg==")
            .subscribe(System.out::println)
    }


    @Test
    fun 백신현황데이터테스트(){
        casesLocationService.getCasesLocation("1","10","qMYuD3Bao+aVVtqIcLH1sqz80i+otqoifcU1C7frDT+SVjQD9FXw8uT1CqYcME+q+A8YKoiZns1FXGGgJVwVzg==","2021-10-11 00:00:00")
            .subscribe(System.out::println)
    }

    @Test
    fun 뉴스데이터테스트(){
        newsService.getNews("코로나백신접종",10,1,"sim")
                .subscribe(System.out::println)
    }
}