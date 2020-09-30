package Tutorial03

import java.lang.Exception

enum class Color (
    private val r: Int, private val g: Int, private val b: Int
) {
    RED(255, 0, 0), ORANGE(255, 165, 0), YELLOW(255, 255, 0),
    GREEN(0, 255, 255), BLUE(0, 0, 255),
    INDIGO(75, 0, 130), VIOLET(238, 130, 238);

    fun rgb () = (r * 256 + g) * 256 + b
}

fun getMnemonic (color: Color) {
    when (color) {
        Color.RED -> "빨"
        Color.ORANGE -> "주"
        Color.YELLOW -> "노"
        Color.GREEN -> "초"
        Color.BLUE -> "파"
        Color.INDIGO -> "남"
        Color.VIOLET -> "보"
    }
}

fun mix (c1: Color, c2: Color) =
    when (setOf(c1, c2)) {
        setOf(Color.RED, Color.YELLOW) -> Color.ORANGE
        setOf(Color.YELLOW, Color.BLUE) -> Color.GREEN
        setOf(Color.BLUE, Color.VIOLET) -> Color.INDIGO
        else -> throw Exception("Dirty color")
    }

fun mixOptimized (c1: Color, c2: Color) =
    when {
        (c1 == Color.RED && c2 == Color.YELLOW) ||
        (c1 == Color.YELLOW && c2 == Color.RED) ->
            Color.ORANGE
        (c1 == Color.BLUE && c2 == Color.YELLOW) ||
        (c1 == Color.YELLOW && c2 == Color.BLUE) ->
            Color.INDIGO
        else -> throw Exception("Dirty color")
    }