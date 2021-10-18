package com.gomdolstudio.covidinfoapp.di.module

import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.gomdolstudio.covidinfoapp.MainActivity
import com.gomdolstudio.covidinfoapp.R
import com.gomdolstudio.covidinfoapp.databinding.FragmentCasesBinding
import com.gomdolstudio.covidinfoapp.di.factory.InjectingSavedStateViewModelFactory
import com.gomdolstudio.musicapp_assistedinjection.di.scope.FragmentScope
import dagger.Module
import dagger.Provides

@Module
class CasesFragmentModule {
    @Provides
    @FragmentScope
    fun provideCasesFragmentBinding(activity: MainActivity): FragmentCasesBinding{
        return DataBindingUtil.inflate<FragmentCasesBinding>(
            activity.layoutInflater,
            R.layout.fragment_cases,
            null,
            false
        )
    }

    @Provides
    @FragmentScope
    fun provideViewModelProvider(activity:MainActivity, viewModelFactory: InjectingSavedStateViewModelFactory): ViewModelProvider {
        return ViewModelProvider(activity, viewModelFactory.create(activity))
    }



}