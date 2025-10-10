package com.kuit.kuit6android.ui.orderhistory.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme

@Composable
fun OrderHistoryDropdownItem(modifier: Modifier = Modifier, category: String) {

        Button(
            shape = RoundedCornerShape(20.dp),
            onClick ={ /**/},
            border = BorderStroke(1.dp, CoupangEatsTheme.colors.gray300),
            colors = ButtonDefaults.buttonColors(      // ✅ 여기 추가
                containerColor = CoupangEatsTheme.colors.white,  // 배경색 (버튼 바탕)
                contentColor = CoupangEatsTheme.colors.black      // 내부 텍스트/아이콘 색
            ),
        ){
            Row(
                verticalAlignment = Alignment.CenterVertically
            )
            {
                Text( text = category,
                    style = CoupangEatsTheme.typography.body_02_R_12,
                    color = CoupangEatsTheme.colors.black
                )
                Icon(
                    modifier = Modifier
                        .padding(start = 3.dp)
                        .size(16.dp),
                    painter = painterResource(id = R.drawable.acco_button),
                    contentDescription = "아코디언",
                    tint = CoupangEatsTheme.colors.black
                )
            }
        }
    }



