package com.ute.bundle

import android.content.Intent
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

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {

                Text(
                    text = "MÀN HÌNH 1",
                    fontSize = 28.sp
                )

                Text(
                    text = "Đây là thông tin từ màn hình 1",
                    fontSize = 20.sp
                )

                Button(
                    onClick = {

                        // Tạo Bundle
                        val bundle = Bundle()

                        // Đưa dữ liệu vào Bundle
                        bundle.putString(
                            "message",
                            "Xin chào! Đây là dữ liệu từ màn hình 1."
                        )

                        // Tạo Intent chuyển sang màn hình 2
                        val intent = Intent(
                            this@MainActivity,
                            SecondActivity::class.java
                        )

                        // Gửi Bundle qua Intent
                        intent.putExtras(bundle)

                        // Mở màn hình 2
                        startActivity(intent)
                    }
                ) {
                    Text("Gửi dữ liệu sang màn hình 2")
                }
            }
        }
    }
}