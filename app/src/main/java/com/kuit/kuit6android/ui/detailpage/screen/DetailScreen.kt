package com.kuit.kuit6android.ui.detailpage.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.ui.detailpage.components.DetailBar

@Composable
fun DetailScreen(
    padding: PaddingValues,
    storeName: String,
    rating: Double,
    reviewCount: Int,
    onBack: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .padding(padding)
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        DetailBar(onBack = onBack)

        Image(
            painter = painterResource(R.drawable.ic_tteok),
            contentDescription = storeName,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .clip(RoundedCornerShape(0.dp))
        )

        Spacer(Modifier.height(16.dp))

        Text(
            text = storeName,
            fontSize = 30.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color.Black,
            modifier = Modifier.padding(horizontal = 16.dp)
        )

        Spacer(Modifier.height(8.dp))

        Row(
            modifier = Modifier.padding(horizontal = 16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {

            Image(
                painter = painterResource(R.drawable.ic_star),
                contentDescription = "평점",
                modifier = Modifier.size(15.dp)
            )

            val ratingText = "%.1f".format(rating)
            val reviewText = "%,d".format(reviewCount)
            Text(
                text = "$ratingText ($reviewText)",
                fontSize = 12.sp,
                color = Color(0xFF575252)
            )
        }
    }
}

@Preview
@Composable
private fun DetailScreen() {

    DetailScreen(
        padding = PaddingValues(),
        storeName = "아워떡볶이",
        rating = 4.9,
        reviewCount = 3849,
        onBack = {}
    )

}
