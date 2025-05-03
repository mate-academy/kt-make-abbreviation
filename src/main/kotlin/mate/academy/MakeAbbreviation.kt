package mate.academy

fun makeAbbr(source: String) : String {
    // implement this function
    var result = source[0].toString()
    for (i in source.indices) {
        if (source[i] ==' ') {
            result += source[i + 1]
        }
    }
    return result.uppercase()
}
