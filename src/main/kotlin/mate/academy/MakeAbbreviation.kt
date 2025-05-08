package mate.academy

fun makeAbbr(source: String) : String {
    var result: String = ""
    source.split(" ").forEach {
        if (it.isNotEmpty()) {
            result += it.first().uppercase()
        }
    }
    return result
}
