package mate.academy

const val SPACE = " "

fun makeAbbr(source: String) : String {
    return source.split(SPACE)
        .map { it.first().uppercaseChar() }
        .joinToString("")
}
