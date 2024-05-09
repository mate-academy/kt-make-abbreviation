package mate.academy

fun makeAbbr(source: String): String {
    return source.split(" ")
                 .filter { it.isNotEmpty() }
                 .map { it[0].uppercaseChar() }
                 .joinToString("")
}
