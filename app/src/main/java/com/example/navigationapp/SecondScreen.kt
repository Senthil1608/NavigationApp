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
fun SecondScreen(name : String,navigateToFirstScreen:()->Unit,navigateToThirdScreen:()-> Unit)
{
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        Text("Second Page",
            fontSize = 24.sp)
        Text("Welcome $name",
            fontSize = 24.sp)
        Spacer(modifier = Modifier.height(15.dp))
        Button(onClick = {
        navigateToFirstScreen()
        }) {
            Text("First Page")
        }
        Button(onClick = {
        navigateToThirdScreen()
        }) {
            Text("Third Page")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SecondScreenPreview()
{
    SecondScreen("",{},{})
}