package mate.academy

fun makeAbbr(source: String) = source.split(' ').joinToString("") { it[0].uppercase() }
