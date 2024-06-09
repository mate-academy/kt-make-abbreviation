package mate.academy

const val DELIMITER = " "
fun makeAbbr(source: String) : String {
    val split = source.split(DELIMITER)
    val sb = StringBuilder()
    for (s in split) {
        sb.append(s[0].uppercase())
    }
    return sb.toString()
}
