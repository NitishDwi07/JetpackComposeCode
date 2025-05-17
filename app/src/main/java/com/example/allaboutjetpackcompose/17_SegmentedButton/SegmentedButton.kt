package com.example.allaboutjetpackcompose.`17_SegmentedButton`

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.DirectionsWalk
import androidx.compose.material.icons.filled.DirectionsBus
import androidx.compose.material.icons.filled.DirectionsCar
import androidx.compose.material3.Icon
import androidx.compose.material3.MultiChoiceSegmentedButtonRow
import androidx.compose.material3.SegmentedButton
import androidx.compose.material3.SegmentedButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.allaboutjetpackcompose.`4_LayoutComposables`.ModifierSample


@Composable
fun SegmentedButtonEx() {
    val selectedOptions = remember {
        mutableStateListOf(false, false, false)
    }

    val options = listOf("Walk", "Ride", "Drive")


    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        MultiChoiceSegmentedButtonRow {
            options.forEachIndexed { index, label ->
                SegmentedButton(
                    shape = SegmentedButtonDefaults.itemShape(
                        index = index,
                        count = options.size
                    ),
                    checked = selectedOptions[index],
                    onCheckedChange = {
                        selectedOptions[index] = !selectedOptions[index]
                    },
                    icon = {
                        SegmentedButtonDefaults.Icon(selectedOptions[index])
                    },
                    label = {
                        when (label) {
                            "Walk" -> Icon(
                                Icons.AutoMirrored.Filled.DirectionsWalk,
                                contentDescription = "Direction Walk"
                            )

                            "Ride" -> Icon(
                                Icons.Default.DirectionsBus,
                                contentDescription = "Direction Walk"
                            )

                            "Drive" -> Icon(
                                Icons.Default.DirectionsCar,
                                contentDescription = "Direction Walk"
                            )
                        }
                    }
                )
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun SegmentedButtonExPreview(){
    SegmentedButtonEx()

}