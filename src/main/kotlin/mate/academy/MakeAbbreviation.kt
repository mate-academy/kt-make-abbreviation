package mate.academy

fun makeAbbr(source: String) : String {
    if (source.isEmpty() || source.isBlank()) return ""
    return source.split(' ').map { it[0].uppercase() }.toString()
}
