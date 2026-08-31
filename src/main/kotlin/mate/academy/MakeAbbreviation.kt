package mate.academy

fun makeAbbr(source: String) : String {
    val split = source.split(" ")
    return split.joinToString("") { it[0].uppercase() }
}
