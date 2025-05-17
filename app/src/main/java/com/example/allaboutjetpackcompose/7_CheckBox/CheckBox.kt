package com.example.allaboutjetpackcompose.`7_CheckBox`

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.material3.TriStateCheckbox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.util.fastForEachIndexed

@Composable
fun CheckBoxSample() {

    val childCheckedState = remember {
        mutableStateListOf(false, false, false)
    }

    val parentState = when {
        childCheckedState.all { it } -> ToggleableState.On
        childCheckedState.none() -> ToggleableState.Off
        else -> ToggleableState.Indeterminate
    }

    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("Select All")
            TriStateCheckbox(
                state = parentState,
                onClick = {
                    val newstate = parentState != ToggleableState.On
                    childCheckedState.fastForEachIndexed { index, _ ->
                        childCheckedState[index] = newstate
                    }
                }
            )
        }
        childCheckedState.fastForEachIndexed { index, checked ->
            Row(
                verticalAlignment = Alignment.CenterVertically

            ) {
                Text("Option ${index + 1}")
                Checkbox(
                    checked = checked,
                    onCheckedChange = {
                        childCheckedState[index] = it
                    }
                )
            }
        }
    }

    if (childCheckedState.all { it }) {
        Text("All selected")
    }
}

@Preview(showSystemUi = true)
@Composable
fun CheckBoxSamplePreview() {
    CheckBoxSample()
}


