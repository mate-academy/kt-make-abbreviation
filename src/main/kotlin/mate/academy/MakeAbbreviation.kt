package mate.academy
const val DELIM: String = " "
fun makeAbbr(source: String) : String {
    // implement this function
    return source.split(DELIM)
        .map { it.first().uppercase() }
        .reduce { firstStr, nextStr -> firstStr + nextStr }
}
