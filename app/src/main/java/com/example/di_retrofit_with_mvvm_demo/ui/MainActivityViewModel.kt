package com.example.di_retrofit_with_mvvm_demo.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.di_retrofit_with_mvvm_demo.models.ProductsItem
import com.example.di_retrofit_with_mvvm_demo.repo.NetworkRepository
import kotlinx.coroutines.launch

class MainActivityViewModel constructor(val repository: NetworkRepository): ViewModel() {
    val list: LiveData<List<ProductsItem>>
    get() = repository.productList

    init {
        viewModelScope.launch {
            repository.getAllProducts()
        }
    }
}