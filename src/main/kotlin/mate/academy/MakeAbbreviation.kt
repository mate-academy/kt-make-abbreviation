package mate.academy

private const val SPLITTER = " "

fun makeAbbr(source: String) : String {
    return source.split(SPLITTER)
        .map{it -> it[0].uppercase()}
        .joinToString(separator = "")
}
