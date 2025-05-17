package com.example.allaboutjetpackcompose.`4_LayoutComposables`

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.widget.ConstraintLayout


// 1. Column,  it allow you to place its children in a vertical sequence.
@Composable
fun AllAboutColumn() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(15.dp)
            .background(Color.Green),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Hello column buddy -> text1 ")
        Text("Hello column buddy -> text2 ")
        Text("Hello column buddy -> text3 ")
        Text("Hello column buddy -> text4 ")

    }
}

// 2. Row, it allow you to place its children in a horizontal sequence.
@Composable
fun AllAboutRow() {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .padding(15.dp)
            .background(Color.Green),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically

    ) {
        Text(" text1 ")
        Text(" text2 ")
        Text(" text3 ")
        Text(" text4 ")
    }

}

// 3. Box, it allow you to place its children in a rectangular layout.
@Composable
fun AllAboutBox() {
    Box(
        modifier = Modifier
            .size(200.dp)
            .padding(15.dp)
            .background(Color.Blue),
        contentAlignment = Alignment.Center,
    ) {
        Box(
            modifier = Modifier
                .size(150.dp)
                .padding(15.dp)
                .background(Color.Red),
            contentAlignment = Alignment.Center
        ) {

        }
    }
}
// 4. Constraint Layout, it allow you to place its children in a constraint layout.
// use Only when Needed and UI is Complex.

@Composable
fun AllAboutConstraintLayout() {
    Column {
        androidx.constraintlayout.compose.ConstraintLayout(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(Color.LightGray)
        ) {
            val (text1, text2, text3) = createRefs()
            Text(
                "Bottom Left",
                modifier = Modifier.constrainAs(text1) {
                    bottom.linkTo(parent.bottom, margin = 8.dp)
                    start.linkTo(parent.start, margin = 8.dp)
                }
            )
            Text(
                "Center Left",
                modifier = Modifier.constrainAs(text2) {
                    top.linkTo(parent.top, margin = 8.dp)
                    bottom.linkTo(parent.bottom, margin = 8.dp)
                    start.linkTo(parent.start, margin = 8.dp)
                    end.linkTo(parent.end, margin = 8.dp)
                }
            )
            Text(
                "Top Right",
                modifier = Modifier.constrainAs(text3) {
                    top.linkTo(parent.top, margin = 8.dp)
                    end.linkTo(parent.end, margin = 8.dp)
                }
            )

        }
    }
    // do preview and you get whats going on
}

// Best Practices  do take more than 5

@Preview(showSystemUi = true)
@Composable
fun ColumnPreview() {
    AllAboutConstraintLayout()
}

