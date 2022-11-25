package com.example.di_retrofit_with_mvvm_demo.utils

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.di_retrofit_with_mvvm_demo.repo.NetworkRepository
import com.example.di_retrofit_with_mvvm_demo.ui.MainActivityViewModel
import javax.inject.Inject

class ViewModelProviderFactory @Inject constructor(val repository: NetworkRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(MainActivityViewModel::class.java)) return MainActivityViewModel(repository) as T
        return super.create(modelClass)
    }
}