package com.example.tp3.mvp.presenter

import com.example.tp3.mvp.contract.MainContract

class MainPresenter(private var view: MainContract.View) : MainContract.Presenter {
    override fun onButtonPressed(text: String) {
        view.showText(text)
    }
}
