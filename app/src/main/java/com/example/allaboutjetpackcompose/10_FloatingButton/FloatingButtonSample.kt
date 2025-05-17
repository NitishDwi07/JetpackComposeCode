package com.example.allaboutjetpackcompose.`10_FloatingButton`

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ExtendedFloatingActionButtonSample() {

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = androidx.compose.ui.Alignment.Center
    ) {
        ExtendedFloatingActionButton(
            onClick = {

            },
            content = {
                Text("This is Floating Button")
            }
        )
    }
}


@Preview(showSystemUi = true)
@Composable
fun ExtendedFloatingActionButtonSamplePreview() {

    ExtendedFloatingActionButtonSample()
}
