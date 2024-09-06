package mate.academy

fun makeAbbr(source: String) : String {
    // implement this function
    return source.split(' ').map { it[0] }.joinToString("").uppercase()
}
