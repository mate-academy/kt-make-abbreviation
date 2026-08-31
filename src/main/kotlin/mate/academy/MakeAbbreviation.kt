package mate.academy

fun makeAbbr(source: String): String = source
    .split(" ")
    .map {
        it.first()
            .uppercaseChar()
    }.joinToString("")
