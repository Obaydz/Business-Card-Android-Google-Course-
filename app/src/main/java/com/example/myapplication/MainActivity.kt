package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Scaffold(
                    bottomBar = {
                        Contact()
                    },
                    containerColor = Color(0xFF10151C)
                ) { paddingValues ->
                    Intro(modifier = Modifier.padding(paddingValues))
                }
            }
        }
    }
}

@Composable
fun Intro(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.fillMaxSize()
    ) {
        Image(
            painterResource(id = R.drawable.oppf),
            contentDescription = null,
            Modifier.size(220.dp)
        )
        Text(
            text = "Oubaid Allah Zmander",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = TextPrimary
        )
        Text(
            text = "Full Stack Developer",
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFFE0B96D)
        )
    }
}

@Composable
fun Contact(modifier: Modifier = Modifier) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .fillMaxWidth()
            .padding(15.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start,
            modifier = Modifier.width(IntrinsicSize.Min)
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    painterResource(id = R.drawable.phone),
                    contentDescription = null,
                    tint = Color(0xFFE0B96D),
                    modifier = Modifier.size(40.dp).padding(6.dp)
                )
                Text(text = "24 301 793", fontSize = 15.sp, color = Color(0xFFAAB2BD))
            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    painterResource(id = R.drawable.instagram),
                    contentDescription = null,
                    tint = Color(0xFFE0B96D),
                    modifier = Modifier.size(40.dp).padding(6.dp)
                )
                Text(text = "@obaydz", fontSize = 15.sp, color = Color(0xFFAAB2BD))
            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    painterResource(id = R.drawable.mail),
                    contentDescription = null,
                    tint = Color(0xFFE0B96D),
                    modifier = Modifier.size(40.dp).padding(6.dp)
                )
                Text(
                    text = "oubeidallahzmander@gmail.com",
                    fontSize = 15.sp,
                    color = Color(0xFFAAB2BD)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Contact()
    }
}