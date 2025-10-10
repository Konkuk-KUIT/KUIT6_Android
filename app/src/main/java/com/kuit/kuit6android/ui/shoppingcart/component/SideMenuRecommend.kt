package com.kuit.kuit6android.ui.shoppingcart.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.ui.shoppingcart.data.RecommendData
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme

@Composable
fun SideMenuRecommend(
    modifier: Modifier = Modifier,
    recommend : RecommendData
) {
    Row(
        modifier= modifier
            .fillMaxWidth()
            .padding(20.dp)
    ){
        Image(
            painter= painterResource(id = recommend.imageResId),
            contentDescription = "추가메뉴",
            modifier= modifier.size(50.dp)
                .clip(RoundedCornerShape(10.dp))
        )
        Spacer(modifier = modifier.width(8.dp))
        Column(
            modifier= modifier.padding(top=10.dp)
        ){
            Text(
                text = "${recommend.name}",
                style = CoupangEatsTheme.typography.head_04_SB_14,
                color = CoupangEatsTheme.colors.black
            )
            Spacer(modifier = modifier.height(5.dp))
            Text(
                text = "${recommend.cost}",
                style = CoupangEatsTheme.typography.body_02_R_12,
                color = CoupangEatsTheme.colors.black)
        }
        Spacer(modifier = Modifier.weight(1f))
        Image(
            painter = painterResource(R.drawable.plus_circle),
            contentDescription= "추가",
            modifier = modifier
                .padding(top=10.dp)
                .size(30.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun RecommendPreview() {
    // ✅ 더미 데이터 생성
    val recommend = RecommendData(
        imageResId = R.drawable.extra_menu1,
        name = "황금올리브치킨 핫크리스피",
        cost = 24500
    )

    SideMenuRecommend(
        modifier = Modifier,
        recommend = recommend // ✅ 객체 전달
    )
}

