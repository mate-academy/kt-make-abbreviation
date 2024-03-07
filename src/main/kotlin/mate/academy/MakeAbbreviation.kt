package mate.academy

fun makeAbbr(source: String) : String {
    // implement this function
    val splitStrings = source.split(" ")
        .map { s -> s[0].toString().uppercase() }
    return splitStrings.joinToString("")
}
