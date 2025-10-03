package com.kuit.kuit6android.ui.home.component

import android.R
import android.R.attr.shape
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.TestModifierUpdaterLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlin.io.path.fileVisitor

@Composable
fun OrderGoGo(modifier: Modifier = Modifier) {
    LazyColumn (
        modifier = modifier
            .padding(top = 14.dp,start = 27.dp, end = 27.dp)
            .clip(shape = RoundedCornerShape(8.dp))
            .fillMaxWidth()
            .background(color = Color(0xFF0C2F65))
            .padding(horizontal = 15.dp)
    ) {
//        item {
//            Text(
//                modifier = modifier
//                    .padding(start = 81.dp,top = 21.dp),
//                text = "와우회원은 횟수 제한없이",
//                fontSize = 13.sp,
//                color = Color(0xFFFEFFFF)
//            )
//            Text(
//                modifier = modifier
//                    .padding(start = 81.dp,top=4.dp),
//                text = "매 주문 무료배달",
//                fontSize = 15.sp,
//                fontWeight = FontWeight.Bold,
//                color = Color(0xFFFEFFFF)
//            )
//        }
        item{
            Row {
                Column (
                    modifier = modifier
                    .padding(start = 81.dp,top = 21.dp)
                ){
                    Text(
                        text = "와우회원은 횟수 제한없이",
                        fontSize = 13.sp,
                        color = Color(0xFFFEFFFF)
                    )
                    Text(
                        modifier = modifier
                            .padding(top=4.dp, bottom = 21.dp),
                        text = "매 주문 무료배달",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFFFEFFFF)
                    )
                }
                Button(
                    onClick = { },
                    colors = ButtonDefaults.buttonColors(containerColor =  Color(0xFFFDFFFF)),
                    shape = RoundedCornerShape(6.dp),
                    modifier = modifier
                        .padding(top = 26.dp, start = 18.dp)
                        .fillMaxWidth()
                        .height(25.dp),
                    contentPadding = PaddingValues(0.dp)
                ) {
                    Text(
                        text = "주문하러 가기",
                        fontSize = 11.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF000000),
                        textAlign = TextAlign.Center
                    )

                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
private fun GoGoPreview() {
    OrderGoGo()
}