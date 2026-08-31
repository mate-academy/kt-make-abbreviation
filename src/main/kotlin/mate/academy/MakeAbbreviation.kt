package mate.academy

const val ZERO = 0;
const val INDEX = 1

fun makeAbbr(source: String): String {
    val strings = source.split(" ").toTypedArray()
    val count = StringBuilder()
    for (string in strings) {
        count.append(string.substring(ZERO, INDEX).uppercase())
    }
    return count.toString()
}
