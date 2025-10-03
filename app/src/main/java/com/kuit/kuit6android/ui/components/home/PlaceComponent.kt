package com.kuit.kuit6android.ui.components.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LocalMinimumInteractiveComponentSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.model.Location
import com.kuit.kuit6android.ui.theme.Pretendard

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PlaceComponent(location: Location, modifier: Modifier = Modifier) {

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier.then(Modifier.size(width = 306.dp, height = 24.dp))
    ){
        Image(
            painter = painterResource(R.drawable.outline_location_on_24),
            contentScale = ContentScale.Crop,
            contentDescription = "place",
            modifier = Modifier.size(24.dp)
        )

        Text(
            text = location.toString(),
            fontSize = 15.sp,
            fontFamily = Pretendard,
            modifier = Modifier.padding(start = 12.dp)
        )

        CompositionLocalProvider(
            LocalMinimumInteractiveComponentSize provides Dp.Unspecified
        ) {
            IconButton(
                onClick = { /* TODO */ },
                modifier = Modifier.padding(start = 9.dp).size(16.dp)
            ) {
                Icon(
                    painter = painterResource(R.drawable.outline_keyboard_arrow_down_24),
                    contentDescription = "down",
                    modifier = Modifier.size(16.dp)
                )
            }
        }

        IconButton(
            onClick = {},
            modifier = Modifier.padding(start = 96.dp)
        ) {
            Icon(
                painter = painterResource(R.drawable.bell),
                contentDescription = "bell",
                modifier = Modifier.size(24.dp)
            )
        }

    }
}

@Preview(showBackground = true)
@Composable
private fun PlaceComponentPreview() {
    PlaceComponent(Location(city = "서울시", town = "광진구", neighborhood = "구의동"))
}