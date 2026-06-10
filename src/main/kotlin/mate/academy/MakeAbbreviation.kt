package mate.academy

fun makeAbbr(source: String) : String {
    if (source.isBlank()) return ""

    return source
        .split(" ")
        .filter { it.isNotEmpty() }.joinToString("") { it.first().uppercase() }
}
