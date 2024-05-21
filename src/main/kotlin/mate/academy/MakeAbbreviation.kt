package mate.academy

fun makeAbbr(source: String): String {
    // implement this function
    return source
        .split(" ").joinToString(separator = "") { it[0].uppercase() }
}
