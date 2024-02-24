package mate.academy

fun makeAbbr(source: String) : String {
    return source.split(' ').joinToString("") { it.first().uppercase() }
}
