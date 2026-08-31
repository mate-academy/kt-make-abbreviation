package mate.academy

fun makeAbbr(source: String) : String {
    return if (source.isEmpty()) "" else source.split(" ")
        .joinToString("") { it.first().uppercase() }
}
