package ir.kasebvatan.cv.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.navigation.Link
import ir.kasebvatan.cv.model.Sections
import ir.kasebvatan.cv.model.Theme
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun header() {
    Row(
        modifier = Modifier.fillMaxWidth(80.percent).margin(topBottom = 50.px),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        leftSide()
        rightSide()
    }
}


@Composable
fun leftSide() {
    Row {
        Image(
            src = "logo.svg", desc = "logo"
        )
    }
}

@Composable
fun rightSide() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .borderRadius(50.px)
            .backgroundColor(Theme.LighterGray.rgb)
            .padding(20.px),
        horizontalArrangement = Arrangement.End
    ) {
        Sections.values().take(6).forEach {
            Link(
                modifier = Modifier
                    .padding(right = 30.px)
                    .fontFamily("font")
                    .fontSize(18.px)
                    .fontWeight(FontWeight.Bold),
                path = it.path,
                text = it.title
            )
        }
    }
}