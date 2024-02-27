package mate.academy

fun makeAbbr(source: String) : String {
    val strings = source.split(" ").map {it[0].uppercase() }
    return strings.joinToString("")
}
