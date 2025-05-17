package com.example.allaboutjetpackcompose.`26_Navigation`

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun HomeScreen(navController: NavController){
    Column (
        modifier = Modifier.fillMaxSize().background(_root_ide_package_.androidx.compose.ui.graphics.Color.Yellow),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally
    ){
        Text("This is the Home Screen",
            fontSize = 30.sp)
        Spacer(Modifier.height(25.dp))
        Button(
            onClick = {
                // here to pass navigation
                navController.navigate(Routes.WishList)
            }
        ) {
            Text(text =" Go to WishList")
        }
    }
}

