package mate.academy

fun makeAbbr(source: String): String {
   var abbr : String = source.split(" ")
        .map { it[0].uppercase() }
        .joinToString { it }.trim()
    return abbr.filter { it.isLetter() }
}
