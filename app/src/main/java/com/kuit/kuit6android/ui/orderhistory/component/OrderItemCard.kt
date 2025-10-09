import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.ui.orderhistory.component.OrderItemActions
import com.kuit.kuit6android.ui.orderhistory.component.OrderItemHeader
import com.kuit.kuit6android.ui.orderhistory.component.OrderItemInfo
import com.kuit.kuit6android.ui.orderhistory.component.OrderItemPrice
import com.kuit.kuit6android.ui.orderhistory.model.OrderItem
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme
import com.kuit.kuit6android.ui.theme.KUIT6_ANDROIDTheme

@Composable
fun OrderItemCard(
    item: OrderItem,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(
            containerColor = CoupangEatsTheme.colors.white
        ),
        shape = RoundedCornerShape(20.dp),
        border = BorderStroke(1.dp, CoupangEatsTheme.colors.gray300)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, top = 13.dp, end = 20.dp, bottom = 20.dp)
        ) {
            //날짜 주문상세
            OrderItemHeader(date = item.date, status = item.status)
            Spacer(modifier = Modifier.height(12.dp))

            OrderItemInfo(
                storeName = item.storeName,
                menuName = item.menuName,
                menuCount = item.menuCount,
                deliveryInfo = item.deliveryInfo,
                isFavorite = item.isFavorite,
                imageRes = item.imageRes
            )
            Spacer(modifier = Modifier.height(16.dp))
            HorizontalDivider(color = CoupangEatsTheme.colors.gray300)
            Spacer(modifier = Modifier.height(16.dp))

            OrderItemPrice(
                originalPrice = item.originalPrice,
                finalPrice = item.finalPrice,
                couponDiscount = item.couponDiscount
            )
            Spacer(modifier = Modifier.height(16.dp))

            OrderItemActions(isStoreOpen = item.isStoreOpen)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun OrderItemCardPreview() {
    KUIT6_ANDROIDTheme {
        OrderItemCard(
            item = OrderItem(
                date = "10월 4일(토)",
                storeName = "신선에이 중곡역점",
                menuName = "1인세트",
                menuCount = "1개",
                deliveryInfo = "떡볶이 1인분, 모둠튀김",
                status = "주문상세",
                originalPrice = 10000,
                finalPrice = 8500,
                couponDiscount = 1500,
                imageRes = R.drawable.wifehousechicken,
                isFavorite = false,
                isStoreOpen = true
            )
        )
    }
}