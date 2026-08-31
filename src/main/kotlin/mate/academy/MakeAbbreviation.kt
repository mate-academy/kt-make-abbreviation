package mate.academy

fun makeAbbr(source: String) : String {
    val splited = source.split(" ")
    val builder = StringBuilder()
    for (s in splited) {
        builder.append(s[0].uppercase())
    }
    return builder.toString()
}
