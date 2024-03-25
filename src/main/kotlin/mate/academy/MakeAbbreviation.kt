package mate.academy

fun makeAbbr(source: String): String {
    var abbr = source[0].toString()
    for (i in source.indices) {
        if (source[i] ==' ') {
            abbr += source[i + 1]
        }
    }
    return abbr.uppercase()
}
