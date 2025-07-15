package mate.academy

fun makeAbbr(source: String) : String {
    return source.split(" ").asSequence().map{
        it.first()
    }.joinToString("").uppercase()
}
