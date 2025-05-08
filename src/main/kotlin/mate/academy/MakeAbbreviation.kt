package mate.academy

const val SPLIT_SYMBOL = " "
const val SEPARATOR = ""
const val ZERO_INDEX = 0

fun makeAbbr(source: String) : String {
    return source.split(" ").joinToString(SEPARATOR) { it[ZERO_INDEX].toString().uppercase() }
}
