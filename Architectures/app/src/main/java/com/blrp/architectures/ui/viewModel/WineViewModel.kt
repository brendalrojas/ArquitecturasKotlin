package com.blrp.architectures.ui.viewModel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.compose.viewModel
import com.blrp.architectures.domain.model.WineModel
import com.blrp.architectures.domain.usecase.WineUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class WineViewModel @Inject constructor(
    private val wineUseCase: WineUseCase,
) : ViewModel() {

    private val _wineData: MutableStateFlow<List<WineModel>?> = MutableStateFlow(null)
    val wineData: StateFlow<List<WineModel>?> get() = _wineData

    init {
        getWines()
    }

    private fun getWines() {
        viewModelScope.launch {
            wineUseCase.invoke().collect {
                _wineData.value = it
            }
        }
    }

}