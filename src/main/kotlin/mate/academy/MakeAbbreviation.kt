package mate.academy

fun makeAbbr(source: String) : String {
    // implement this function
    return source
        .split(" ")
        .joinToString("") { it.first().uppercase() }
}
