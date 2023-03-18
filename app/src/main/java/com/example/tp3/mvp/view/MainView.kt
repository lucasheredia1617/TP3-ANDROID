package com.example.tp3.mvp.view

import android.app.Activity
import android.widget.Toast
import com.example.tp3.databinding.ActivityMainBinding
import com.example.tp3.mvp.contract.MainContract

class MainView(private var activity: Activity) : MainContract.View {
    private var binding: ActivityMainBinding = ActivityMainBinding.inflate(activity.layoutInflater)

    init {
        activity.setContentView(binding.root)
    }

    override fun showText(text: String) {
        Toast.makeText(activity, binding.textInput.text, Toast.LENGTH_SHORT).show()
    }
}
