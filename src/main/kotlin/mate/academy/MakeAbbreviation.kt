package mate.academy

fun makeAbbr(source: String) : String {
    return source.split(" ").map { it.uppercase()[0] }.toString()
}
