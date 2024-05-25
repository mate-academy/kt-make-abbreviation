package mate.academy

fun main(args: Array<String>) {
    println(makeAbbr("simplified molecular input line entry specification"))
}
fun makeAbbr(source: String) : String {
    var result : String = source[0].uppercase()
    source.forEachIndexed { index, c -> if(c == ' ') result += source[index + 1].uppercase()  }
    return result
}
