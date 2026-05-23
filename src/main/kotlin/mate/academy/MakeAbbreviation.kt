package mate.academy

fun makeAbbr(source: String) : String {
    // Split on any whitespace (spaces, tabs, newlines), ignore empty parts
    // Use map + joinToString for concise and efficient construction
    return source
        .split(Regex("\\s+"))
        .filter { it.isNotBlank() }
        .map { it[0].uppercaseChar() }
        .joinToString("")
}
