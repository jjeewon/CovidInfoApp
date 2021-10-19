package com.gomdolstudio.covidinfoapp.di

import com.gomdolstudio.covidinfoapp.data.service.CasesLocationService
import com.gomdolstudio.covidinfoapp.data.service.NewsService
import com.gomdolstudio.covidinfoapp.data.service.VaccinationCenterService

import dagger.Module
import dagger.Provides
import dagger.Reusable
import retrofit2.Retrofit
import javax.inject.Named

@Module
class RetrofitModule {
    @Provides
    @Reusable
    fun provideVaccinationLocationRetrofitService(@Named("vaccine")retrofit: Retrofit): CasesLocationService {
        return retrofit.create(CasesLocationService::class.java)
    }

    @Provides
    @Reusable
    fun provideVaccinationCenterRetrofitService(@Named("vaccine")retrofit: Retrofit): VaccinationCenterService{
        return retrofit.create(VaccinationCenterService::class.java)
    }

    @Provides
    @Reusable
    fun provideNewsRetrofitService(@Named("news")retrofit: Retrofit): NewsService{
        return retrofit.create(NewsService::class.java)
    }
}

