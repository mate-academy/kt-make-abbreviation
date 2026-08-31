package mate.academy

const val ZERO = 0
fun makeAbbr(source: String) : String {
    return source.split(" ").asSequence()
        .map { word -> word[ZERO].uppercase() }.toList()
        .joinToString(separator = "")
}
