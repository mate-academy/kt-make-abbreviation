package mate.academy

fun makeAbbr(source: String) : String {
    return source.split(" ")
        .map { it.uppercase() }
        .map { it[0] }
        .joinToString("")
}
