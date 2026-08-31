package mate.academy

fun makeAbbr(source: String) : String {
    if (source == "") {
        return ""
    }

    val words= source.split(" ")
    val abbr = words.map { word -> word.uppercase().first() }
    return abbr.joinToString("")
}
