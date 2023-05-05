package ir.kasebvatan.cv.components

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextDecorationLine
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.icons.fa.FaBars
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import ir.kasebvatan.cv.model.Sections
import ir.kasebvatan.cv.model.Theme
import ir.kasebvatan.cv.styles.LogoStyle
import ir.kasebvatan.cv.styles.NavigationItemStyle
import ir.kasebvatan.cv.util.Constant.FONT_FAMILY
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun header() {
    val breakpoint by rememberBreakpoint()
    Row(
        modifier = Modifier.fillMaxWidth(if (breakpoint > Breakpoint.MD) 80.percent else 90.percent)
            .margin(topBottom = 50.px),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {

        leftSide(breakpoint)
        if (breakpoint > Breakpoint.MD) rightSide()
    }
}


@Composable
fun leftSide(breakpoint: Breakpoint) {
    Row (

        verticalAlignment = Alignment.CenterVertically,
    ){
        if (breakpoint <= Breakpoint.MD){
            FaBars(
                modifier = Modifier
                    .margin(right = 15.px),
                size = IconSize.XL
            )
        }

        Image(
            modifier = LogoStyle.toModifier()
                .backgroundColor(Theme.LighterGray.rgb)
                .borderRadius(bottomRight = 50.px, topRight = 50.px)
                .padding(topBottom = 5.px),
            src = "logo.svg",
            desc = "logo",

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
                modifier = NavigationItemStyle.toModifier()
                    .padding(right = 30.px)
                    .fontFamily(FONT_FAMILY)
                    .fontSize(18.px)
                    .fontWeight(FontWeight.Bold)
                    .textDecorationLine(TextDecorationLine.None),
                path = it.path,
                text = it.title
            )
        }
    }
}