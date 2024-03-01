package mate.academy

fun makeAbbr(source: String) : String {
    var result: String = ""
    val words: List<String> = source.split(" ")
    for (i in 0 until words.size) {
        result += words[i].first().uppercase()
    }
    return result
}
