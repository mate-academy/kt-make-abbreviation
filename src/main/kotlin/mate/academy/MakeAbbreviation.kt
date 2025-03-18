package mate.academy

fun makeAbbr(source: String) : String {
    var result: String = source.first().toString()
    source.split(" ").forEach {
        if (it.isNotEmpty()) {
            result += it.first()
        }
    }
    return result
}
