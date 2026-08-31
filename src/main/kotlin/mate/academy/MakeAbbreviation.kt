package mate.academy

fun makeAbbr(phrase: String): String {
    return phrase
        .split(" ")                  // розбити на слова
        .filter { it.isNotBlank() }  // забрати зайві пробіли, якщо є
        .map { it.first().uppercase() } // взяти першу літеру кожного слова
        .joinToString("")
}
