package com.kuit.kuit6android.ui.components.test

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

// 1) State & Events
data class SignUpState(
    val name: String = "",
    val agreed: Boolean = false,
    val canSubmit: Boolean = false
)

sealed interface SignUpEvent {
    data class NameChanged(val value: String): SignUpEvent
    data class AgreeToggled(val value: Boolean): SignUpEvent
    data object Submit: SignUpEvent
}

// 2) Reducer (UDF 핵심)
fun reduce(state: SignUpState, event: SignUpEvent): SignUpState = when(event) {
    is SignUpEvent.NameChanged -> {
        val next = state.copy(name = event.value)
        next.copy(canSubmit = next.name.isNotBlank() && next.agreed)
    }
    is SignUpEvent.AgreeToggled -> {
        val next = state.copy(agreed = event.value)
        next.copy(canSubmit = next.name.isNotBlank() && next.agreed)
    }
    SignUpEvent.Submit -> state // 실제 제출은 상위에서 처리
}

// 3) Screen (Stateless, hoisted state를 주입받음)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUpScreen(
    state: SignUpState,
    onEvent: (SignUpEvent) -> Unit,
    modifier: Modifier = Modifier
) {
    Scaffold(
        topBar = { CenterAlignedTopAppBar(title = { Text("Create account") }) }
    ) { inner ->
        Column(
            modifier = modifier
                .padding(inner)
                .padding(20.dp)
                .fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(16.dp, Alignment.Top),
        ) {
            OutlinedTextField(
                value = state.name,
                onValueChange = { onEvent(SignUpEvent.NameChanged(it)) },
                label = { Text("Your name") },
                singleLine = true,
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Text,
                    imeAction = ImeAction.Done
                ),
                keyboardActions = KeyboardActions(
                    onDone = { onEvent(SignUpEvent.Submit) }
                ),
                modifier = Modifier.fillMaxWidth()
            )

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Checkbox(
                    checked = state.agreed,
                    onCheckedChange = { onEvent(SignUpEvent.AgreeToggled(it)) }
                )
                Text("I agree to the Terms and Privacy Policy")
            }

            Button(
                enabled = state.canSubmit,
                onClick = { onEvent(SignUpEvent.Submit) },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Create account")
            }

            // 상태 프리뷰용(실서비스에선 제거 가능)
            AssistChip(
                onClick = {},
                label = { Text(if (state.canSubmit) "Ready to submit" else "Incomplete") }
            )
        }
    }
}

// 4) Preview (상위에서 상태를 소유하고 전달)
@Preview(showBackground = true, widthDp = 360)
@Composable
private fun SignUpPreview() {
    var state by remember { mutableStateOf(SignUpState()) }
    MaterialTheme {
        SignUpScreen(
            state = state,
            onEvent = { event ->
                state = reduce(state, event)
                if (event is SignUpEvent.Submit && state.canSubmit) {
                    // 실제 제출 로직(예: ViewModel, Nav) 위치
                    // e.g., viewModel.createAccount(state.name)
                }
            }
        )
    }
}