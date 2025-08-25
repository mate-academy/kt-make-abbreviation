package mate.academy

fun makeAbbr(source: String) : String {
    val words: List<String> = source.split(" ")
    var abbreviation = ""

    for (i in words.indices) {
        abbreviation += words[i][0].uppercaseChar()
    }
    return abbreviation
}
