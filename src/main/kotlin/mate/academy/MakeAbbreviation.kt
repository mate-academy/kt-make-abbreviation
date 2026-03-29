package mate.academy

fun makeAbbr(source: String) : String {
    var string: String = ""
    source
        .split(" ")
        .map {char -> string += char[0]}
    return string.uppercase()
}
