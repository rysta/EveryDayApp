package com.example.everydayapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Tip(
    val dayNumber: Int,
    @StringRes val tipRes: Int,
    @StringRes val descriptionRes: Int,
    @DrawableRes val imageRes: Int
)