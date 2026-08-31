package mate.academy

const val DELIMITER = " "
const val SEPARATOR = ""

fun makeAbbr(source: String) : String {
    return source.takeIf { it.isNotBlank() && it.isNotEmpty() }
        ?.split(DELIMITER)
        ?.joinToString(separator = SEPARATOR) { it.first().uppercase() }.toString()
}
