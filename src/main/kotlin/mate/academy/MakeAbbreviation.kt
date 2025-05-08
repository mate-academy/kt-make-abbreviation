package mate.academy

fun makeAbbr(source: String) : String {
    val words = source.split(" ")
    val abbreviation = words.map { it[0].toUpperCase() }.joinToString("")

    return abbreviation
}
