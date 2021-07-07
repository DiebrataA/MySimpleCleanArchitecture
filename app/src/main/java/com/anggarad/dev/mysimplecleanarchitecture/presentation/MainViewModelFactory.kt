package com.anggarad.dev.mysimplecleanarchitecture.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.anggarad.dev.mysimplecleanarchitecture.di.Injection
import com.anggarad.dev.mysimplecleanarchitecture.domain.MessageUseCase

class MainViewModelFactory(
    private var messageUseCase: MessageUseCase
) : ViewModelProvider.NewInstanceFactory(){

    companion object{
        private var instance: MainViewModelFactory? = null

        fun getInstance(): MainViewModelFactory =
            instance ?: synchronized(this) {
                instance ?: MainViewModelFactory(Injection.provideUseCase())
            }
    }

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return when {
            modelClass.isAssignableFrom(MainViewModel::class.java) -> MainViewModel(messageUseCase) as T
            else -> throw IllegalArgumentException("Unknown ViewModel class: " + modelClass.name)
        }
    }
}