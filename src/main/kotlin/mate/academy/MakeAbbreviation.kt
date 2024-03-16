package mate.academy

fun makeAbbr(source: String) : String {
    return source.split(' ')
        .map { it[0].toString() }
        .joinToString(separator = "") { it }
        .uppercase()
}
