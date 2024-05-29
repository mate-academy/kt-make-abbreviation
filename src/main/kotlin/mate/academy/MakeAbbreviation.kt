package mate.academy

fun makeAbbr(source: String) : String {
    return source.split(" ")
        .joinToString("") { it[0].uppercase() }
}
