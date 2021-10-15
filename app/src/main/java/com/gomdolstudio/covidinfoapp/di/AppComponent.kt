package com.gomdolstudio.covidinfoapp.di

import com.gomdolstudio.covidinfoapp.App
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidSupportInjectionModule::class])
interface AppComponent : AndroidInjector<App> {
    @Component.Factory
    abstract class Factory: AndroidInjector.Factory<App>{}
}