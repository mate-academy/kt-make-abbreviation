package mate.academy

fun makeAbbr(source: String) : String {
    val words: List<String> = source.split(" ")
    var result = ""
    words.forEach {result += it[0].uppercase()}
    return result
}
