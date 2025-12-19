package mate.academy

fun makeAbbr(source: String) : String {
    if (source.isEmpty()) return " "
    val list = mutableListOf<Char>()
    list.add(source[0])
    for (char in 1 until source.length) {
        if (source[char - 1] == ' ') {
            list.add(source[char])
        }
    }
    return list.joinToString("").uppercase()
}
