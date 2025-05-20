package mate.academy

fun makeAbbr(source: String) : String {
    return source
        .trim()
        .split(" ")
        .map { it.first().uppercaseChar() }
        .joinToString("")
}
