package mate.academy

fun makeAbbr(source: String) : String {
    val words: List<String> = source.split(" ")
    val builder = StringBuilder()

    for (word in words) {
        builder.append(word[0].toString().uppercase())
    }
    return builder.toString()
}
