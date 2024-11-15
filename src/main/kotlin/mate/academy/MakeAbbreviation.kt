package mate.academy

fun makeAbbr(source: String) : String {
    var abbr = ""
    for (word in source.split(" ")) {
        abbr += word.first().uppercase()
    }
    return abbr
}
