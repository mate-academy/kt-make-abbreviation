package mate.academy

fun makeAbbr(source: String) : String {
    val result = StringBuilder()
    val split = source.split(" ")
    split.forEach { result.append(it[0].uppercase()) }
    return result.toString()
}
