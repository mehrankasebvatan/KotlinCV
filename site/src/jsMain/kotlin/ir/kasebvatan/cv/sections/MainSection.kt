package ir.kasebvatan.cv.sections

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import ir.kasebvatan.cv.components.header
import ir.kasebvatan.cv.components.socialBar
import ir.kasebvatan.cv.model.Sections
import ir.kasebvatan.cv.model.Theme
import ir.kasebvatan.cv.styles.MainButtonStyle
import ir.kasebvatan.cv.styles.MainImageStyle
import ir.kasebvatan.cv.util.Constant.ABOUT_ME
import ir.kasebvatan.cv.util.Constant.FONT_FAMILY
import ir.kasebvatan.cv.util.Constant.SECTION_WIDTH
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Button
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun mainSection() {
    val breakpoint by rememberBreakpoint()
    Box(
        modifier = Modifier
            .maxWidth(SECTION_WIDTH.px)
            .id(Sections.Home.id),
        contentAlignment = Alignment.TopCenter
    ) {
        mainBackground()
        mainContent(breakpoint)
    }


}

@Composable
fun mainBackground() {

    Image(
        modifier = Modifier.fillMaxSize().objectFit(ObjectFit.Cover), src = "background.svg", desc = "Background Image"
    )

}


@Composable
fun mainContent(breakpoint: Breakpoint) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        header()
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            SimpleGrid(
                modifier = Modifier.fillMaxWidth(
                    if (breakpoint >= Breakpoint.MD) 80.percent else 90.percent
                ),
                numColumns = numColumns(base = 1, md = 2)
            ) {
                mainText(breakpoint)
                mainImage()
            }


        }
    }
}

@Composable
fun mainText(breakpoint: Breakpoint) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        if (breakpoint > Breakpoint.MD) socialBar()
        Column {
            P(
                attrs = Modifier
                    .margin(topBottom = 0.px)
                    .fontFamily(FONT_FAMILY)
                    .fontSize(if (breakpoint >= Breakpoint.MD) 30.px else 20.px)
                    .fontWeight(FontWeight.Normal)
                    .color(Theme.Primary.rgb)
                    .toAttrs()
            ) {
                Text("Hello I`m")
            }

            P(
                attrs = Modifier
                    .margin(top = 20.px, bottom = 0.px)
                    .fontFamily(FONT_FAMILY)
                    .fontSize(if (breakpoint >= Breakpoint.MD) 55.px else 30.px)
                    .fontWeight(FontWeight.ExtraBold)
                    .color(Theme.DarkGray.rgb)
                    .toAttrs()
            ) {
                Text("Mehran Kasebvatan")
            }

            P(
                attrs = Modifier
                    .margin(top = 10.px, bottom = 5.px)
                    .fontFamily(FONT_FAMILY)
                    .fontSize(20.px)
                    .fontWeight(FontWeight.Bold)
                    .color(Theme.DarkGray.rgb)
                    .toAttrs()
            ) {
                Text("Mobile & Web Developer/Designer")
            }

            P(
                attrs = Modifier
                    .margin(bottom = 25.px)
                    .maxWidth(400.px)
                    .fontFamily(FONT_FAMILY)
                    .fontStyle(FontStyle.Italic)
                    .fontSize(15.px)
                    .fontWeight(FontWeight.Normal)
                    .color(Theme.DarkGray.rgb)
                    .toAttrs()
            ) {
                Text(ABOUT_ME)
            }

            Button(
                attrs = MainButtonStyle.toModifier()
                    .border(0.px)
                    .borderRadius(5.px)
                    .padding(topBottom = 15.px)
                    .fontSize(25.px)
                    .backgroundColor(Theme.Primary.rgb)
                    .color(Color.white)
                    .cursor(Cursor.Pointer)
                    .toAttrs()
            ) {
                Link(
                    path = Sections.Contact.path,
                    modifier = Modifier
                        .color(Color.white)
                        .textDecorationLine(TextDecorationLine.None),
                    text = "Hire Me"
                )
            }


        }
    }
}

@Composable
fun mainImage() {
    Column(
        modifier = Modifier
            .fillMaxSize(80.percent)
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            modifier = MainImageStyle
                .toModifier()
                .fillMaxWidth(),
            src = "me.png",
            desc = ""
        )
    }
}














