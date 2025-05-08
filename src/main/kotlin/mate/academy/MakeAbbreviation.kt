package mate.academy

const val DELIMITER = " "
const val FIRST_CHAR = 0
const val SEPARATOR = ""

fun makeAbbr(source: String) : String {
    return source.split(DELIMITER)
        .filter { it.isNotEmpty() }
        .map { it[FIRST_CHAR].uppercase() }
        .joinToString(SEPARATOR)
}
