package mate.academy

fun makeAbbr(source: String) : String {
    var answer: String = source[0].toString()
    for (i in source.indices) {
        if (source[i] == ' ') {
            answer += source[i + 1]
        }
    }
    return answer.uppercase()
}
