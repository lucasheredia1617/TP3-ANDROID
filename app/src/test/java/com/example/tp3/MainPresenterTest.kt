package com.example.tp3

import com.example.tp3.mvp.contract.MainContract
import com.example.tp3.mvp.presenter.MainPresenter
import io.mockk.MockKAnnotations
import io.mockk.impl.annotations.MockK
import io.mockk.verify
import org.junit.Before
import org.junit.Test

class MainPresenterTest {
    private lateinit var mainPresenter: MainContract.Presenter

    @MockK
    private lateinit var mainView: MainContract.View

    @Before
    fun setUp() {
        MockKAnnotations.init(this, relaxed = true)
        mainPresenter = MainPresenter(mainView)
    }

    @Test
    fun `Show text test `() {
        mainPresenter.onButtonPressed("Pepe")
        verify { mainView.showText("Pepe") }
    }
}
