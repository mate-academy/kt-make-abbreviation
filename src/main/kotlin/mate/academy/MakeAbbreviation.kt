package mate.academy

fun makeAbbr(source: String) : String {
    return source.split(" ")
            .joinToString(separator = "") { ab -> ab.substring(0, 1).uppercase() }
}
