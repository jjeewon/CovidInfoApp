package com.gomdolstudio.covidinfoapp.di.module

import android.app.Application
import android.content.Context
import com.gomdolstudio.covidinfoapp.App
import com.gomdolstudio.covidinfoapp.ApplicationContext
import com.gomdolstudio.covidinfoapp.di.RetrofitModule
import com.gomdolstudio.covidinfoapp.di.ViewModelModule
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Named
import javax.inject.Singleton

@Module(includes = [(ViewModelModule::class),(RetrofitModule::class)])
class AppModule {

    @Singleton
    @Provides
    @Named("vaccine")
    internal fun provideVaccinationRetrofitService(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://api.odcloud.kr/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
    }

    @Singleton
    @Provides
    @Named("news")
    internal fun provideNewsRetrofitService(): Retrofit {
        return Retrofit.Builder()
                .baseUrl("https://openapi.naver.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
    }


    @Provides
    @Singleton
    fun provideApp(app: App): Application {
        return app
    }

    @Provides
    @Singleton
    @ApplicationContext
    fun provideContext(app: App): Context {
        return app
    }
}