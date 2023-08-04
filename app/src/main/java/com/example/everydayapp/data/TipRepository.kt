package com.example.everydayapp.data

import com.example.everydayapp.R
import com.example.everydayapp.model.Tip

object TipRepository {
    val tips = listOf<Tip>(
        Tip(
            dayNumber = 1,
            tipRes = R.string.tip_1,
            descriptionRes = R.string.description_1,
            imageRes =  R.drawable.screen1
        ),
        Tip(
            dayNumber = 2,
            tipRes = R.string.tip_2,
            descriptionRes = R.string.description_2,
            imageRes = R.drawable.screen2
        ),
        Tip(
            dayNumber = 3,
            tipRes = R.string.tip_3,
            descriptionRes = R.string.description_3,
            imageRes = R.drawable.screen3
        ),
        Tip(
            dayNumber = 4,
            tipRes = R.string.tip_4,
            descriptionRes = R.string.description_4,
            imageRes = R.drawable.screen4
        ),
        Tip(
            dayNumber = 5,
            tipRes = R.string.tip_5,
            descriptionRes = R.string.description_5,
            imageRes = R.drawable.screen5
        ),
        Tip(
            dayNumber = 6,
            tipRes = R.string.tip_6,
            descriptionRes = R.string.description_6,
            imageRes = R.drawable.screen6
        ),
        Tip(
            dayNumber = 7,
            tipRes = R.string.tip_7,
            descriptionRes = R.string.description_7,
            imageRes = R.drawable.screen7
        )
    )
}