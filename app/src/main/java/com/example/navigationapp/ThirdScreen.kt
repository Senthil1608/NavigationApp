package com.example.navigationapp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ThirdScreen(navigateToFirstScreen :()->Unit,navigateToSecondScreen:()->Unit)
{
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        Text("Third Page",
            fontSize = 24.sp)
        Spacer(modifier = Modifier.height(15.dp))
        Button(onClick = {
            navigateToFirstScreen()
        }) {
            Text("First Page")
        }
        Button(onClick = {
        navigateToSecondScreen()
        }) {
            Text("Second Page")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ThirdScreenPreview()
{
    ThirdScreen({},{})
}