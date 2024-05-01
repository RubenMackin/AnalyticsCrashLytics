package com.rubenmackin.analyticscrashlytics.ui

import androidx.lifecycle.ViewModel
import com.rubenmackin.analyticscrashlytics.data.AnalyticsManager
import com.rubenmackin.analyticscrashlytics.data.model.AnalyticModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val analyticsManager: AnalyticsManager) :
    ViewModel() {

    fun onLoginSelected() {
        //LOGICA
        val analyticModel = AnalyticModel(
            title = "eventodia", analyticsString = listOf(
                Pair("clave", "valor")
            )
        )

        analyticsManager.sendEvenet(analyticModel)
    }
}