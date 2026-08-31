package mate.academy

fun makeAbbr(source: String) : String {
    val array = source.split(" ")
    val string: String = array.joinToString("") { word -> word[0].toString().uppercase() }
    return string
}
