package com.example.allaboutjetpackcompose.`12_Scaffold`

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldExample(){
    var presses by remember { mutableStateOf(0) }

    Scaffold (
        topBar =
            {
                TopAppBar(
                    colors = TopAppBarColors(
                        containerColor = MaterialTheme.colorScheme.primaryContainer,
                        titleContentColor = MaterialTheme.colorScheme.primary,
                        scrolledContainerColor = MaterialTheme.colorScheme.surfaceContainer,
                        navigationIconContentColor = MaterialTheme.colorScheme.primaryContainer,
                        actionIconContentColor = MaterialTheme.colorScheme.primaryContainer,
                    ),
                    title = {
                        Text("Top app bar")
                    }
                )
            },

        bottomBar = {
            BottomAppBar (
                containerColor = MaterialTheme.colorScheme.primaryContainer,
                contentColor = MaterialTheme.colorScheme.primary,
            ){
                Text(
                    text = "Bottom app bar",
                    modifier = Modifier.padding(horizontal = 16.dp),
                    textAlign = TextAlign.Center,
                )
            }
        },

        floatingActionButton = {
            FloatingActionButton(onClick = { presses++ }) {
               Text("I've been clicked $presses times")
            }
        }
    ){
        innerPadding ->
        Column (
            modifier = Modifier.padding(innerPadding).background(Color.Yellow)
        ){
            Text("This is Scaffold Content",
                )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun PreviewSample()
{
    ScaffoldExample()
}