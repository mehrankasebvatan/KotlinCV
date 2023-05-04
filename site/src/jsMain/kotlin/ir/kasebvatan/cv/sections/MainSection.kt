package ir.kasebvatan.cv.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.maxWidth
import com.varabyte.kobweb.compose.ui.modifiers.objectFit
import com.varabyte.kobweb.silk.components.graphics.Image
import ir.kasebvatan.cv.components.header
import ir.kasebvatan.cv.util.Constant.SECTION_WIDTH
import org.jetbrains.compose.web.css.px

@Composable
fun mainSection() {
    Box(
        modifier = Modifier.maxWidth(SECTION_WIDTH.px),
        contentAlignment = Alignment.TopCenter
    ) {
        mainBackground()
        header()
    }


}

@Composable
fun mainBackground() {

    Image(
        modifier = Modifier.fillMaxSize()
            .objectFit(ObjectFit.Cover),
        src = "background.svg",
        desc = "Background Image"
    )

}

