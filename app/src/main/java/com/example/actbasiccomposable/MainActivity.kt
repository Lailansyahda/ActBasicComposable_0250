package com.example.actbasiccomposable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.actbasiccomposable.ui.theme.ActBasicComposableTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ActBasicComposableTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // Panggil layout TugasLogin di sini
                    TugasLogin(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}