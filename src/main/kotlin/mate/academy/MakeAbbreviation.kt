package mate.academy

fun makeAbbr(source: String) : String {
    return source.split(" ")
        .filter { it.isNotBlank() }.joinToString("") { it[0].uppercase() }
}
