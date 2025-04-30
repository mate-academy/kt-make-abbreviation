package mate.academy

fun makeAbbr(source: String) : String {
    // implement this function
    val result = mutableListOf<String>()
    source.split(" ").forEach {
        result.add(it[0].uppercase())
    }
    return result.joinToString("")
}
