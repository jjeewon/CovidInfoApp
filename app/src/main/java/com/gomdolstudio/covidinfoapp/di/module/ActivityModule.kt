package com.gomdolstudio.covidinfoapp.di.module

import com.gomdolstudio.covidinfoapp.MainActivity
import com.gomdolstudio.musicapp_assistedinjection.di.scope.ActivityScope
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {
    @ActivityScope
    @ContributesAndroidInjector(modules = [(MainModule::class)])
    abstract fun getMainActivity(): MainActivity
}

