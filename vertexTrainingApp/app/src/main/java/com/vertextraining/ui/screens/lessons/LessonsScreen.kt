package com.vertextraining.ui.screens.lessons

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun LessonsScreen(navController: NavController) {
    val lessons = remember {
        listOf(
            "What is Retail Trading?",
            "Understanding Price Charts",
            "Types of Orders",
            "Risk Management Basics",
            "Trading Psychology"
        )
    }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Text(
                text = "Lessons",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )

            lessons.forEachIndexed { index, lessonTitle ->
                LessonItem(title = lessonTitle) {
                    // TODO: navController.navigate("lessonDetail/$index")
                }
            }
        }
    }
}

@Composable
fun LessonItem(title: String, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick)
            .padding(vertical = 4.dp),
        elevation = CardDefaults.cardElevation(2.dp)
    ) {
        Box(
            modifier = Modifier
                .padding(16.dp),
            contentAlignment = Alignment.CenterStart
        ) {
            Text(text = title, fontSize = 16.sp)
        }
    }
}