package mate.academy

fun makeAbbr(source: String) : String {
    // implement this function
    var splited = source.split(" ")
    return splited.joinToString("") { it[0].toString() }.uppercase()
}
