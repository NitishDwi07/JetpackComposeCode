package com.example.allaboutjetpackcompose.`3_CoreComponents`

import androidx.compose.foundation.basicMarquee
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp


@Composable
fun SimpleText() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            "Hello Jetpack Compose",
            color = Color.Red,
            fontSize = 30.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold,
            style = TextStyle(
                shadow = Shadow(
                    color = Color.Black,
                    blurRadius = 10f
                )
            )
        )
    }
}


@Composable
fun ColorfulText() {
    val rainboxColors = listOf(
        Color.Blue,
        Color.Red,
        Color.Cyan,
        Color.Green,
        Color.Magenta,
        Color.Yellow
    )

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = buildAnnotatedString {
                append("Do not allow people to dim your shine \n")
                withStyle(
                    SpanStyle(
                        brush = Brush.linearGradient(
                            colors = rainboxColors
                        )
                    )
                )
                {
                    append("because they are blinded.\n")
                    append("and tell them to put some sunglasses on \n")
                }

            }
        )
    }
}


@Composable
fun ScrollableText() {

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Hey This is Nitish Dwivedi experimenting with the jetpack compose".repeat(50),
            maxLines = 3,
            fontSize = 50.sp,
            overflow = TextOverflow.Ellipsis
        )
    }
}

@Preview(showSystemUi = true)
@Composable
fun SimpleTextPreview() {
    ScrollableText()
}
