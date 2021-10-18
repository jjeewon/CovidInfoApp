package com.gomdolstudio.covidinfoapp.di.module

import android.content.Context
import androidx.databinding.DataBindingUtil
import com.gomdolstudio.covidinfoapp.MainActivity
import com.gomdolstudio.covidinfoapp.R
import com.gomdolstudio.covidinfoapp.databinding.ActivityMainBinding
import com.gomdolstudio.covidinfoapp.ui.CasesFragment
import com.gomdolstudio.musicapp_assistedinjection.di.scope.ActivityContext
import com.gomdolstudio.musicapp_assistedinjection.di.scope.ActivityScope
import com.gomdolstudio.musicapp_assistedinjection.di.scope.FragmentScope
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainModule {
    @Module
    companion object{
        @JvmStatic
        @Provides
        @ActivityScope
        fun providePlayerActivityBinding(activity: MainActivity): ActivityMainBinding {
            return DataBindingUtil.setContentView(activity, R.layout.activity_main)
        }
        @ActivityContext
        @JvmStatic
        @Provides
        fun provideContext(activity: MainActivity): Context {
            return activity
        }
    }

    @FragmentScope
    @ContributesAndroidInjector(modules = [(CasesFragmentModule::class)])
    abstract fun getCasesFragment(): CasesFragment
}