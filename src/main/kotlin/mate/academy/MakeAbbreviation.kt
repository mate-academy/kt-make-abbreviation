package mate.academy

fun makeAbbr(source: String) : String {
    // implement this function
    var string = ""
    source.split(" ").forEach { string = string.plus(it[0].uppercase()) }
    return string
}
