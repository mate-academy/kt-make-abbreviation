package mate.academy

const val FIRST = 0

fun makeAbbr(source: String) : String {
    // implement this function
    return source.trim().split(" ").joinToString("") { it[FIRST].toString().uppercase() }
}
