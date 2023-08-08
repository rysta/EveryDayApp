package com.example.everydayapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults.exitUntilCollapsedScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.everydayapp.data.TipRepository
import com.example.everydayapp.data.TipRepository.tips
import com.example.everydayapp.model.Tip

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TipTopAppBar(){
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = stringResource(R.string.app_name),
                style = MaterialTheme.typography.bodyLarge,
            )
        },
        scrollBehavior = exitUntilCollapsedScrollBehavior()
    )
}

@Composable
fun TipScreen(innerPadding: PaddingValues){
    LazyColumn(
        contentPadding = innerPadding
    ){
        items(tips){
            TipItem(
                tip = it,
                modifier = Modifier.padding(
                    horizontal = dimensionResource(R.dimen.padding_medium),
                    vertical = dimensionResource(R.dimen.padding_small)
                )
            )
        }
    }
}

@Composable
fun TipItem(tip: Tip, modifier: Modifier = Modifier){

    var expanded by remember { mutableStateOf(false) }

    Card(
        modifier = modifier.clickable { expanded = !expanded },
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
                Image(
                    painter = painterResource(tip.imageRes),
                    contentDescription = stringResource(tip.tipRes),
                    contentScale = ContentScale.Crop
                )

                if(expanded){
                    Spacer(modifier = Modifier.height(height = dimensionResource(R.dimen.padding_small)))
                    Text(text = stringResource(tip.descriptionRes), style = MaterialTheme.typography.bodyMedium)
                }
            }
        }
    }
}