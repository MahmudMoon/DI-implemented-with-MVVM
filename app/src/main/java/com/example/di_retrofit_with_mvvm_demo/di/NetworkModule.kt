package com.example.di_retrofit_with_mvvm_demo.di

import com.example.di_retrofit_with_mvvm_demo.retrofit.FakerAPI
import com.example.di_retrofit_with_mvvm_demo.utils.Constants
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class NetworkModule {
    @Singleton
    @Provides
    fun getRetrofitObject(): Retrofit{
        return Retrofit.Builder()
            .baseUrl(Constants.baseApi)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Singleton
    @Provides
    fun getFakerApi(retrofit: Retrofit): FakerAPI{
        return retrofit.create(FakerAPI::class.java)
    }
}