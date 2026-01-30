package mate.academy

fun makeAbbr(source: String) : String {
    return source.trim()
        .split(Regex("\\s+"))
        .joinToString("") { it.first().uppercaseChar().toString() }
}
