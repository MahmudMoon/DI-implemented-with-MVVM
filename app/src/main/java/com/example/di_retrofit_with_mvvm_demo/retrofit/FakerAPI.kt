package com.example.di_retrofit_with_mvvm_demo.retrofit

import com.example.di_retrofit_with_mvvm_demo.models.ProductsItem
import com.example.di_retrofit_with_mvvm_demo.utils.Constants
import retrofit2.Response
import retrofit2.http.GET

interface FakerAPI {
    @GET(Constants.productEndPoint)
    suspend fun getRetrofitResponse(): Response<List<ProductsItem>>
}