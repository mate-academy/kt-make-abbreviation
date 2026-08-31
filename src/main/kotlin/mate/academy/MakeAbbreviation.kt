package mate.academy

const val FIRST = 1

fun makeAbbr(source: String) : String {
    return source
        .split(" ")
        .map { it.trim().take(FIRST).uppercase() }
        .joinToString("")
}
