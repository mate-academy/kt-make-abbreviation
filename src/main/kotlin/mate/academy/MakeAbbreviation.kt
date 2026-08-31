package mate.academy

fun makeAbbr(source: String): String {
    return source.split(" ")
        .map {
            it.first().uppercase()
        }
        .joinToString {
            it
        }
        .replace(", ","")
}
