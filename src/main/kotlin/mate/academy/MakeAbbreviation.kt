package mate.academy

fun makeAbbr(source: String): String {
    // implement this function
    val arr = source.split(" ")
    var res = ""
    arr.forEach { res += it[0] }
    return res.uppercase()
}
