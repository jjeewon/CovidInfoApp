package com.gomdolstudio.covidinfoapp.di.module

import android.app.Application
import android.content.Context
import com.gomdolstudio.covidinfoapp.App
import com.gomdolstudio.covidinfoapp.ApplicationContext
import com.gomdolstudio.covidinfoapp.di.ViewModelModule
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [(ViewModelModule::class)])
class AppModule {
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