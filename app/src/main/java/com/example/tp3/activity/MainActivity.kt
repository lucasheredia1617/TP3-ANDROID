package com.example.tp3.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tp3.mvp.presenter.MainPresenter
import com.example.tp3.mvp.view.MainView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        MainPresenter(MainView(this))
    }
}
