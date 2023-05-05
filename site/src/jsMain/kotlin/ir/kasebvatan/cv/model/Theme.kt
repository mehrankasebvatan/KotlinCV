package ir.kasebvatan.cv.model

import org.jetbrains.compose.web.css.CSSColorValue
import org.jetbrains.compose.web.css.rgb


enum class Theme(
    val hex: String,
    val rgb: CSSColorValue
) {
    Primary(hex = "#FD8A8A", rgb = rgb(r = 253, g = 138, b = 138)),
    Secondary(hex = "#11324D", rgb = rgb(r = 17, g = 50, b = 77)),
    Gray(hex = "#CFCFCF", rgb = rgb(r = 207, g = 207, b = 207)),
    LightGray(hex = "#EDEDED", rgb = rgb(r = 237, g = 237, b = 237)),
    DarkGray(hex = "#444444", rgb = rgb(r = 68, g = 68, b = 68)),
    LighterGray(hex = "#F9F9F9", rgb = rgb(r = 249, g = 249, b = 249))
}