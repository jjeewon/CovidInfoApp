package com.gomdolstudio.covidinfoapp.di

import androidx.lifecycle.ViewModel
import com.gomdolstudio.covidinfoapp.di.factory.AssistedSavedStateViewModelFactory
import com.squareup.inject.assisted.AssistedInject
import com.squareup.inject.assisted.dagger2.AssistedModule
import dagger.Module
import dagger.multibindings.Multibinds

@AssistedModule
@Module(includes = [AssistedInject_ViewModelModule::class])
abstract class ViewModelModule {

    // 일반 뷰모델들의 멀티 바인딩
    @Multibinds
    abstract fun bindsViewModels(): Map<Class<out ViewModel>, @JvmSuppressWildcards ViewModel>

    // AssistedInject로 관리하는 ViewModel Factory 멀티 바인딩
    @Multibinds
    abstract fun bindAssistedViewModels(): Map<Class<out ViewModel>, @JvmSuppressWildcards AssistedSavedStateViewModelFactory<out ViewModel>>
}