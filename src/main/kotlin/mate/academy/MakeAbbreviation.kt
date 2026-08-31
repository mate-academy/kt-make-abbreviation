package mate.academy

private const val SPACE = " "

fun makeAbbr(source: String) : String {
    val result: StringBuilder = StringBuilder()

    source.split(SPACE).asSequence()
        .map { it[0] }
        .forEach(result::append)

    return result.toString().uppercase()
}
