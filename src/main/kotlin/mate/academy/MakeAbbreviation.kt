package mate.academy

fun makeAbbr(source: String) : String {
    return source.split(" ")
        .map { it.first().uppercaseChar() }
        .joinToString("")
}
