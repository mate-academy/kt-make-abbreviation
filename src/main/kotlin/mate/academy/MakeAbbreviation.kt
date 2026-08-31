package mate.academy

fun makeAbbr(source: String) : String {
    return source.split(" ").toList().map { it.first() }.joinToString("").uppercase()
}
