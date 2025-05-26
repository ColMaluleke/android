package com.vertextraining

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.vertextraining.ui.App
import com.vertextraining.ui.theme.VertexTrainingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VertexTrainingTheme {
                App() // Root composable we’ll define next
            }
        }
    }
}