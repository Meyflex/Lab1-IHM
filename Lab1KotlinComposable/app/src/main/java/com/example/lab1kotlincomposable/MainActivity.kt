package com.example.lab1kotlincomposable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import com.example.lab1kotlincomposable.R

@Composable
fun ComposeAppTheme(content: @Composable () -> Unit) {
    val colors = lightColorScheme()
    MaterialTheme(
        colorScheme = colors,
        content = content
    )
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeAppTheme {
                MyApp()
            }
        }
    }
}

@Composable
fun MyApp() {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 60.dp),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.image),
                contentDescription = null,
                modifier = Modifier
                    .height(200.dp)
                    .width(200.dp)
            )
            Spacer(modifier = Modifier.height(15.dp))
            Row {
                Button(onClick = { /*TODO*/ }) {
                    Text("Button")
                }
                Spacer(modifier = Modifier.width(15.dp))
                Button(onClick = { /*TODO*/ }) {
                    Text("Button")
                }
            }
            Spacer(modifier = Modifier.height(15.dp))
            Row {
                Button(onClick = { /*TODO*/ }) {
                    Text("Button")
                }
                Spacer(modifier = Modifier.width(15.dp))
                Button(onClick = { /*TODO*/ }) {
                    Text("Button")
                }
            }
            Spacer(modifier = Modifier.height(15.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text("Email", fontSize = 18.sp)
                Spacer(modifier = Modifier.width(15.dp))
                OutlinedTextField(
                    value = "",
                    onValueChange = { /*TODO*/ },
                    singleLine = true,
                    keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Done),
                    keyboardActions = KeyboardActions(onDone = { /*TODO*/ }),
                    modifier = Modifier
                        .weight(1f)
                        .background(Color(0xFFEEEEEE))
                )
            }
        }
    }
}