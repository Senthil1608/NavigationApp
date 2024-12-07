package com.example.navigationapp

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun MyApp()
{
    val navController = rememberNavController()
    NavHost(navController = navController,
        startDestination = "firstscreen") {
        composable("firstscreen"){
            FirstScreen({name->
               navController.navigate("secondscreen/$name")},
                {navController.navigate("thirdscreen") })
        }
        composable("secondscreen/{name}"){
            val name= it.arguments?.getString("name")?:"No Name"
            SecondScreen(name,{
                navController.navigate("firstscreen")
            },{ navController.navigate("thirdscreen")})
        }
        composable("thirdscreen"){
            ThirdScreen( {navController.navigate("firstscreen")},
                { navController.navigate("secondscreen") }
            )

        }
    }
}