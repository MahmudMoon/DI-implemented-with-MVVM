package com.example.di_retrofit_with_mvvm_demo.ui

import android.app.Application
import com.example.di_retrofit_with_mvvm_demo.di.ApplicationComponents
import com.example.di_retrofit_with_mvvm_demo.di.DaggerApplicationComponents

class MyApp: Application() {
    lateinit var applicationComponents: ApplicationComponents
    override fun onCreate() {
        super.onCreate()
        applicationComponents = DaggerApplicationComponents.builder().build()
    }
}