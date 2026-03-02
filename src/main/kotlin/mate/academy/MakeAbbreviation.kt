package mate.academy

const val ONE = 1

fun makeAbbr(source: String) : String {
    val result = mutableListOf<Char>()
    result.add(source.first())
    source.forEachIndexed { i, c ->
        if (c == ' ') {
            result.add(source[i + ONE])
        }
    }
    return result.toString()
        .replace(Regex("[^A-Za-z]"), "")
        .uppercase()
}
