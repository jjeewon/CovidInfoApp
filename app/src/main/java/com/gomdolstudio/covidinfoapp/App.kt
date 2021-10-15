package com.gomdolstudio.covidinfoapp

import com.gomdolstudio.covidinfoapp.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

open class App : DaggerApplication(){
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
       return DaggerAppComponent.factory().create(this)
    }

    override fun onCreate() {
        super.onCreate()
    }

}