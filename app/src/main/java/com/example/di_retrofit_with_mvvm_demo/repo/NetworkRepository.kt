package com.example.di_retrofit_with_mvvm_demo.repo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.di_retrofit_with_mvvm_demo.models.ProductsItem
import com.example.di_retrofit_with_mvvm_demo.retrofit.FakerAPI
import javax.inject.Inject

class NetworkRepository @Inject constructor(val fakerApi: FakerAPI) {
    private var _productList = MutableLiveData<List<ProductsItem>>()
    val productList: LiveData<List<ProductsItem>>
    get() = _productList

    suspend fun getAllProducts(){
       val response =  fakerApi.getRetrofitResponse()
        if(response.isSuccessful && response.body()!=null){
             _productList.postValue(response.body())
        }
    }
}