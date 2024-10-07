package com.example.via_cep.presenter.features.features.home.viewmodel

import androidx.lifecycle.ViewModel
import com.example.via_cep.presenter.features.features.forms.action.FormAction
import com.example.via_cep.presenter.features.features.home.state.HomeState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class HomeViewModel: ViewModel() {

    private val _state = MutableStateFlow(HomeState())
    var state: StateFlow<HomeState> = _state

    init {

    }

    fun action(action: FormAction) {

    }


}