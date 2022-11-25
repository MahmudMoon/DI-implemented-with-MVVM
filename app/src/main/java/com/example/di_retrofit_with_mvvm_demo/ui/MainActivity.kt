package com.example.di_retrofit_with_mvvm_demo.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.example.di_retrofit_with_mvvm_demo.R
import com.example.di_retrofit_with_mvvm_demo.di.ApplicationComponents
import com.example.di_retrofit_with_mvvm_demo.utils.ViewModelProviderFactory
import javax.inject.Inject
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
    lateinit var mainActivityViewModel: MainActivityViewModel
    @Inject
    lateinit var viewModelProviderFactory: ViewModelProviderFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        (application as MyApp).applicationComponents.inject(this)
        mainActivityViewModel = ViewModelProvider(this, viewModelProviderFactory).get(MainActivityViewModel::class.java)
        mainActivityViewModel.list.observe(this){
            Log.d(TAG, "onCreate: ${it.size}")
        }
    }
}