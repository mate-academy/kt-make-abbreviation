package mate.academy

fun makeAbbr(source: String): String {
    val words = source.split(" ")
    val abbreviation = words.joinToString("") { it[0].toString().uppercase() }
    return abbreviation
}
