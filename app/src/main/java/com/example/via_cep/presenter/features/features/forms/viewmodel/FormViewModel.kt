package com.example.via_cep.presenter.features.features.forms.viewmodel

import androidx.lifecycle.ViewModel
import com.example.via_cep.domain.remote.useCase.GetAdressUseCase
import com.example.via_cep.presenter.features.features.forms.action.FormAction
import com.example.via_cep.presenter.features.features.forms.state.FormState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class FormViewModel @Inject constructor(
    private val GetAdressUseCase: GetAdressUseCase
): ViewModel() {

    private val _state = MutableStateFlow(FormState())
    var state: StateFlow<FormState> = _state

    init {

    }

    fun action(action: FormAction) {

    }


}