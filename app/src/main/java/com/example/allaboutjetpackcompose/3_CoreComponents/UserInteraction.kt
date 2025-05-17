package com.example.allaboutjetpackcompose.`3_CoreComponents`

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextLinkStyles
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withLink
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun PartialSelectableText() {
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        SelectionContainer {
            Column {
                Text("This is a text which can be selected")
                Text("This is one too")
                Text("This is the third text")
                DisableSelection {
                    Text("But not this one selectable one")
                    Text("Neither this one is selectable text too")
                }

            }
        }
    }
}



@Composable
fun AnnotatedStringWithListnenerSample() {
    val uriHandler = LocalUriHandler.current
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            buildAnnotatedString {
                append("Build better apps faster with ")
                val link = LinkAnnotation.Url(
                    url = "https://developer.android.com/jetpack/compose",

                    TextLinkStyles(
                        SpanStyle(
                            color = Color.Blue
                        )
                    )
                )
                {
                    val url = (it as LinkAnnotation.Url).url
                    uriHandler.openUri(url)

                }
                withLink(link) {
                    append("Jetpack Compose")
                }
            }
        )
    }
}


@Preview(showSystemUi = true)
@Composable
fun showPreview() {
    AnnotatedStringWithListnenerSample()
}