package mate.academy

fun makeAbbr(source: String) : String {
    // implement this function
    return source.split(" ")
        .map { it.first().uppercaseChar() }
        .joinToString("")
}
