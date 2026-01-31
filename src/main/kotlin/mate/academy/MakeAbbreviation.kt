package mate.academy

fun makeAbbr(source: String): String {
    return source
        .split(" ")
        .joinToString("") { it.first().uppercase() }
}

fun main() {
    println(makeAbbr("national aeronautics space administration"))
}
