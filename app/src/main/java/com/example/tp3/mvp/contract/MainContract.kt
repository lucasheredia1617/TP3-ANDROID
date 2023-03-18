package com.example.tp3.mvp.contract

interface MainContract {

    interface View {
        fun showToast(text: String)
    }

    interface Presenter {
        fun onShowTextButtonPressed(text: String)
    }
}
