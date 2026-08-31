package mate.academy

fun makeAbbr(source: String) : String {

    var split = source.split(" ")
    val result = split.asSequence().map { it.substring(0, 1).uppercase() }.toList().joinToString("")

    return result
}
