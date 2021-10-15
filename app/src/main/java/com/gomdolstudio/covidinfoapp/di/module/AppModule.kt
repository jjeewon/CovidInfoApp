package com.gomdolstudio.covidinfoapp.di.module

import android.app.Application
import android.content.Context
import com.gomdolstudio.covidinfoapp.App
import com.gomdolstudio.covidinfoapp.ApplicationContext
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
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