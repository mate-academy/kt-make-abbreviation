package mate.academy

const val INDEX_OF_FIRST_LETTER = 0
fun makeAbbr(source: String) : String {
    return source.uppercase().split(" ").map { it[INDEX_OF_FIRST_LETTER] }.joinToString("")
}
