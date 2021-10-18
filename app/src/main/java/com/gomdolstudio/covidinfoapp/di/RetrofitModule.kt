package com.gomdolstudio.covidinfoapp.di

import com.gomdolstudio.covidinfoapp.data.service.CasesLocationService
import com.gomdolstudio.covidinfoapp.data.service.VaccinationCenterService

import dagger.Module
import dagger.Provides
import dagger.Reusable
import retrofit2.Retrofit

@Module
class RetrofitModule {
    @Provides
    @Reusable
    fun provideVaccinationLocationRetrofitService(retrofit: Retrofit): CasesLocationService {
        return retrofit.create(CasesLocationService::class.java)
    }

    @Provides
    @Reusable
    fun provideVaccinationCenterRetrofitService(retrofit: Retrofit): VaccinationCenterService{
        return retrofit.create(VaccinationCenterService::class.java)
    }
}

