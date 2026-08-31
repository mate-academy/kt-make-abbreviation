package mate.academy

fun makeAbbr(source: String) : String {
    val arr = source.split(" ")
    val str = arr
        .map { it[0].uppercase()}
        .toList()
        .joinToString("")
    return str
}
