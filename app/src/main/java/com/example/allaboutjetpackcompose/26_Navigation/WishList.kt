package com.example.allaboutjetpackcompose.`26_Navigation`

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.allaboutjetpackcompose.`4_LayoutComposables`.ModifierSample

@Composable
fun WishListScreen(navController: NavController){
    Column (
        modifier = Modifier.fillMaxSize().background(color = _root_ide_package_.androidx.compose.ui.graphics.Color.Green),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally
    ){
        Text("This is the Home Screen",
            fontSize = 30.sp)
        Spacer(Modifier.height(20.dp))
        Button(
            onClick = {
                // here to pass navigation
                 navController.navigate(Routes.Home)
            }
        ) {
            Text(text =" Go to HomeScreen")
        }
    }
}

