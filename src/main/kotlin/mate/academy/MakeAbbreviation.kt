package mate.academy
const val ZERO = 0

fun makeAbbr(source: String) : String {
    return source.split(" ")
        .joinToString("") { it[ZERO].uppercase() }
}
