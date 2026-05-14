package com.github.kotlintelegrambot.entities

import com.google.gson.annotations.SerializedName as Name

data class Location(
    val longitude: Float,
    val latitude: Float,
    @Name("horizontal_accuracy") val horizontalAccuracy: Float? = null,
    @Name("live_period") val livePeriod: Int? = null,
    val heading: Int? = null,
    @Name("proximity_alert_radius") val proximityAlertRadius: Int? = null,
)
