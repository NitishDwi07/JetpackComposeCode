package com.example.allaboutjetpackcompose.`3_CoreComponents`

import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview

// 1. Filled Button

@Composable
fun FilledButtonSample() {
    var context = LocalContext.current
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center)
    {
        // 1. Filled Button
//        Button(onClick = {
//            Toast.makeText(context, "Button is clicked", Toast.LENGTH_SHORT).show()
//        }
//        ) {
//            Text(text = "Filled Button")
//
//        }



        // 2. Tonal Button
//        FilledTonalButton(
//            onClick = {
//                Toast.makeText(context, "Button is clicked", Toast.LENGTH_SHORT).show()
//            }
//        ) {
//            Text(text = "Filled Tonal Button")
//
//        }

        // 3. Outlined Button
//        OutlinedButton(
//            onClick = {
//                Toast.makeText(context, "Button is clicked", Toast.LENGTH_SHORT).show()
//            }
//        ) {
//            Text(text = "Outlined Button")
//        }


        // 4. Elevated Button
//        ElevatedButton(
//            onClick = {
//                Toast.makeText(context, "Button is clicked", Toast.LENGTH_SHORT).show()
//            }
//        ) {
//            Text("Elevated Button")
//            }


        // 5. Text Button

        TextButton(
            onClick = {}
        ) {
            Text("Text Button")
        }
    }
}






@Preview(showSystemUi = true)
@Composable
fun FilledButtonSamplePreview() {
    FilledButtonSample()
}
