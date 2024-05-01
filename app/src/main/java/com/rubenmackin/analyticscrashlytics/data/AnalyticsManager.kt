package com.rubenmackin.analyticscrashlytics.data

import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.analytics.logEvent
import com.rubenmackin.analyticscrashlytics.data.model.AnalyticModel
import javax.inject.Inject

class AnalyticsManager @Inject constructor(private val firebaseAnalytics: FirebaseAnalytics) {

    fun example() {
        firebaseAnalytics.logEvent(FirebaseAnalytics.Event.APP_OPEN) {
            param(FirebaseAnalytics.Param.SCORE, "100")
        }
    }

    fun example2() {
        firebaseAnalytics.logEvent("RubenDevs") {
            param("super", "pro")
            param("mega", 100)
        }
    }

    fun sendEvenet(analyticsModel: AnalyticModel) {
        firebaseAnalytics.logEvent(analyticsModel.title) {
            analyticsModel.analyticsString.map {
                param(it.first, it.second)
            }

            analyticsModel.analyticsLong.map {
                param(it.first, it.second)
            }

            analyticsModel.analyticsDouble.map {
                param(it.first, it.second)
            }

            analyticsModel.analyticsBundle.map {
                param(it.first, it.second)
            }

            analyticsModel.analyticsBundleArray.map {
                param(it.first, it.second)
            }
        }

        //superSDK.track(title = "PRO EVENT)
    }
}