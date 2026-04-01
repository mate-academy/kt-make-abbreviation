package mate.academy

fun makeAbbr(source: String) : String {
   return phrase
       .split(" ")
       .filter { it.isNotEmpty() }
       .map { it.first().uppercaseChar() }
       .joinToString("")
}
