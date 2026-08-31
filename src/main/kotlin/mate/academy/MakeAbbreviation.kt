package mate.academy

fun makeAbbr(source: String) : String {
    var result : String = ""
    if (source.isBlank()) {
        return result
    }
    result = result.plus(source[0]).uppercase()
    for(i in 1 until source.length) {
        if (source[i] == ' ') {
            result = result.plus(source[i + 1].uppercaseChar())
        }
    }
    return result
}
