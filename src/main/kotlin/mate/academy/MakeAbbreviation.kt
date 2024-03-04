package mate.academy

fun makeAbbr(source: String) : String {
    var string = ""
    val strings = source.split(" ")
    strings.forEach { string += it[0].uppercase() }
    return string
}
