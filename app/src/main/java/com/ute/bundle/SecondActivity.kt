package com.ute.bundle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

class SecondActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Nhận Bundle từ MainActivity
        val bundle = intent.extras

        // Lấy dữ liệu từ Bundle
        val message = bundle?.getString("message")

        setContent {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "MÀN HÌNH 2",
                    fontSize = 28.sp
                )

                Text(
                    text = "Thông tin nhận được: $message",
                    fontSize = 20.sp
                )

                Button(
                    onClick = {
                        finish()
                    }
                ) {
                    Text("Back về màn hình 1")
                }
            }
        }
    }
}