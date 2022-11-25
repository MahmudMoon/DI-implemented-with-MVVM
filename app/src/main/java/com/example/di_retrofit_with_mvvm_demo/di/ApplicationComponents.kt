package com.example.di_retrofit_with_mvvm_demo.di

import com.example.di_retrofit_with_mvvm_demo.ui.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class])
interface ApplicationComponents {
    fun inject(mainActivity: MainActivity)
}