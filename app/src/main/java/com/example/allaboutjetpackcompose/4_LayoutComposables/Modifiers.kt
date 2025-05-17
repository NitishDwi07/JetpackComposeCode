package com.example.allaboutjetpackcompose.`4_LayoutComposables`

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

//Modifiers
//Modifiers are available in all Composable Functions like
// Button,Text,Image, Column.. etc

// ctrl + alt + space for entire modifier features

@Composable
fun ModifierSample(modifier: Modifier) {

    Box (
        modifier = Modifier.size(200.dp).background(Color.Blue),
        contentAlignment =  Alignment.Center
    ){
        Text("This is Jetpack Compose",
            modifier = Modifier.background(Color.Yellow)
        )
    }
}

@Preview(showSystemUi = true)
@Composable
fun ModifierSamplePreview(){
    ModifierSample(Modifier.padding())
}