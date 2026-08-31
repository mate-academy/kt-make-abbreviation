package mate.academy

fun makeAbbr(source: String) = source.split(" ").map { it.first() }.joinToString("").uppercase()

