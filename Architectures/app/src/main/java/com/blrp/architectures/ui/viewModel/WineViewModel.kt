package com.blrp.architectures.ui.viewModel

import androidx.lifecycle.ViewModel
import com.blrp.architectures.domain.usecase.WineUseCase


class GSDAExploreViewModel(
    private val wineUseCase: WineUseCase,
) : ViewModel() {


    private fun getWines() {
        wineUseCase.invoke()
    }


}