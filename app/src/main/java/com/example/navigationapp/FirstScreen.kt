package com.example.navigationapp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun FirstScreen(navigateToSecondScreen:(String)->Unit, navigateToThirdScreen :()->Unit)
{
    val name = remember { mutableStateOf("") }
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        Text("First Page",
            fontSize = 24.sp)
        Spacer(modifier = Modifier.height(15.dp))
        OutlinedTextField(value= name.value, onValueChange = { name.value = it})
        Spacer(modifier = Modifier.height(15.dp))
        Button(onClick = {
                navigateToSecondScreen(name.value)
        }) {
            Text("Second Page")
        }
        Spacer(modifier = Modifier.height(15.dp))
        Button(onClick = {
            navigateToThirdScreen()
        }) {
            Text("Third Page")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FirstScreenPreview()
{
    FirstScreen({},{})
}