package mate.academy

fun makeAbbr(source: String) : String {
    val words = source.split(" ")
    var abbr = ""
    for (word in words) {
        abbr += word.first().uppercaseChar()
    }
    return abbr
}
