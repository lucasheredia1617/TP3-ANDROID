package com.example.tp3.mvp.contract

interface MainContract {

    interface View {
        fun showText(text: String)
    }

    interface Presenter {
        fun onButtonPressed(text: String)
    }
}
