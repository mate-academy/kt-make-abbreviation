package mate.academy

fun makeAbbr(source: String): String {
    return source.split(" ").joinToString("") { s -> s[0].uppercase() }
}
