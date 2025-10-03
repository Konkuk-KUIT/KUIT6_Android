package com.kuit.kuit6android.ui.myeats.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit6android.R

@Composable
fun MyEatsScreen(
    padding: PaddingValues,
    onNavigateToFavorite: () -> Unit,     // ← 즐겨찾기 이동 콜백
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .padding(padding)
            .fillMaxSize()
            .background(Color.White)
            .verticalScroll(rememberScrollState())
            .padding(horizontal = 20.dp)
    ) {
        Spacer(Modifier.height(24.dp))

        // 프로필 헤더
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("조익성", fontSize = 24.sp, fontWeight = FontWeight.Bold, color = Color.Black)
            Spacer(Modifier.height(4.dp))
            Text("010-****-****", fontSize = 14.sp, color = Color(0xFF666666))
        }

        Spacer(Modifier.height(24.dp))

        // 통계 3칸
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            StatItem(value = 0, label = "내가 남긴 리뷰")
            StatItem(value = 0, label = "도움이 됐어요")
            StatItem(value = 0, label = "즐겨찾기")
        }

        Spacer(Modifier.height(24.dp))

        // 자세히 보기 (아웃라인 버튼)
        OutlinedButton(
            onClick = { /* TODO: 상세로 이동 예정이면 여기에 */ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 4.dp),
            border = ButtonDefaults.outlinedButtonBorder(true),
            colors = ButtonDefaults.outlinedButtonColors(contentColor = Color(0xFF3A8DFF))
        ) {
            Text("자세히 보기", fontSize = 16.sp)
        }

        Spacer(Modifier.height(24.dp))
        HorizontalDivider(color = Color(0xFFE5E5EA))
        Spacer(Modifier.height(16.dp))

        // 즐겨찾기 섹션 (탭하면 즐겨찾기 페이지로 이동)
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clickable { onNavigateToFavorite() },
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // 프로젝트 리소스 하트 아이콘 사용 (없는 경우 교체)
            androidx.compose.material3.Icon(
                painter = androidx.compose.ui.res.painterResource(R.drawable.ic_favorite),
                contentDescription = "즐겨찾기",
                tint = Color.Black
            )
            Text("즐겨찾기", fontSize = 20.sp, fontWeight = FontWeight.SemiBold)
        }

        Spacer(Modifier.height(8.dp))
        Text(
            text = "즐겨찾기한 가게가 없습니다.",
            fontSize = 14.sp,
            color = Color(0xFF8E8E93),
            modifier = Modifier.padding(start = 28.dp, top = 2.dp)
        )

        Spacer(Modifier.height(36.dp))
    }
}

@Composable
private fun StatItem(value: Int, label: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(value.toString(), fontSize = 22.sp, fontWeight = FontWeight.Bold)
        Spacer(Modifier.height(4.dp))
        Text(label, fontSize = 12.sp, color = Color(0xFF8E8E93))
    }
}

@Preview(showBackground = true)
@Composable
private fun MyEatsScreen(){
    MyEatsScreen()
}