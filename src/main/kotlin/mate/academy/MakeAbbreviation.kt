package mate.academy

import java.util.*

fun makeAbbr(source: String): String {
    val words = source.split(" ")
    val abbreviation = StringBuilder()

    for (word in words) {
        if (word.length > 1) {
            abbreviation.append(word[0].uppercaseChar())
        } else if (word.isNotEmpty()) {
            abbreviation.append(word.uppercase(Locale.getDefault()))
        }
    }

    return abbreviation.toString()
}
