package mate.academy

fun makeAbbr(source: String) : String {
    val words = source.split(" ")
    val abbreviation = StringBuilder()
    for (word in words) {
        abbreviation.append(word[0].uppercase())
    }
    return abbreviation.toString()
}
