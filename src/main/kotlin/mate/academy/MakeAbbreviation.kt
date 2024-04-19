package mate.academy

const val FIRST_CHAR_INDEX: Int = 0

fun makeAbbr(source: String) : String {
    val strings = source.uppercase().split(" ")
    var result: String = ""
    for (element in strings) {
        result += element[FIRST_CHAR_INDEX]
    }
    return result
}
