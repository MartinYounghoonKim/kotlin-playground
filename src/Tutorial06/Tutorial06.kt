package Tutorial06

import java.io.BufferedReader
import java.io.StringReader
import java.lang.NumberFormatException
import javax.print.attribute.IntegerSyntax

fun main() {
    val reader = BufferedReader(StringReader("Not a number"))
    readNumber(reader)
}

fun readNumber (reader: BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        ""
    }
    println(number)
}