package ir.kasebvatan.cv.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.style.KobwebComposeStyleSheet.target
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.navigation.OpenLinkStrategy
import com.varabyte.kobweb.silk.components.icons.fa.*
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.toModifier
import ir.kasebvatan.cv.styles.SocialLinkStyle
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.px

@Composable
fun socialBar(){
    Column (
        modifier = Modifier
            .margin(right = 25.px)
            .padding(topBottom = 25.px)
            .minWidth(40.px)
            .borderRadius(25.px)
            .backgroundColor(Color.white),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        socialLink()
    }
}


@Composable
private fun socialLink(){
    Link(
        path = "https://github.com/mehrankasebvatan",
        openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB
    ){
        FaGithub(
            modifier = SocialLinkStyle.toModifier().margin(bottom = 40.px),
            size = IconSize.LG
        )
    }

    Link(
        path = "https://linkedin.com/kasebvatan",
        openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB
    ){
        FaLinkedin(
            modifier = SocialLinkStyle.toModifier().margin(bottom = 40.px),
            size = IconSize.LG
        )
    }

    Link(
        path = "https://wa.me/989216380039",
        openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB
    ){
        FaWhatsapp(
            modifier = SocialLinkStyle.toModifier().margin(bottom = 40.px),
            size = IconSize.LG
        )
    }

    Link(
        path = "https://t.me/mkv_dev",
        openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB
    ){
        FaTelegram(
            modifier = SocialLinkStyle.toModifier().margin(bottom = 40.px),
            size = IconSize.LG
        )
    }

    Link(
        path = "https://cafebazaar.ir/developer/kasebvatan",
        openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB
    ){
        FaGooglePlay(
            modifier = SocialLinkStyle.toModifier(),
            size = IconSize.LG
        )
    }


}