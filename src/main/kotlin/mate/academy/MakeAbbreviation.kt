package mate.academy

fun makeAbbr(source: String): String {
    val words = source.split(" ")
    var abbreviation = ""

    for (word in words) {
        abbreviation += word[0].uppercase()
    }

    return abbreviation
}
