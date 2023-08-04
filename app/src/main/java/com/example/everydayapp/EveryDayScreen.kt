package com.example.everydayapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.everydayapp.data.TipRepository
import com.example.everydayapp.model.Tip

@Composable
fun TipItem(tip: Tip, modifier: Modifier = Modifier){
    Card(
        modifier = modifier,
        elevation = CardDefaults
            .cardElevation(defaultElevation = dimensionResource(R.dimen.card_elevation))
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(dimensionResource(R.dimen.padding_medium))
        ) {
            Column {
                Text(text = stringResource(R.string.day_number_title, tip.dayNumber), style = MaterialTheme.typography.labelSmall)
                Text(text = stringResource(tip.tipRes), style = MaterialTheme.typography.titleLarge)

                Spacer(modifier = Modifier.height(height = dimensionResource(R.dimen.padding_small)))
                Image(painter = painterResource(tip.imageRes), contentDescription = stringResource(tip.tipRes))
                Spacer(modifier = Modifier.height(height = dimensionResource(R.dimen.padding_small)))

                Text(text = stringResource(tip.descriptionRes), style = MaterialTheme.typography.bodyMedium)
            }
        }
    }
}

@Composable
@Preview
fun TipItemPreview(){
    TipItem(tip = TipRepository.tips.component1())
}