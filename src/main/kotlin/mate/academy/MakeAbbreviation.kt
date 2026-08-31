package mate.academy

fun makeAbbr(source: String) : String {
    val words = source.split(" ")
    return words.joinToString("") { it.first().toString().uppercase() }
}
