package mate.academy

fun makeAbbr(source: String): String {
    val resultList = mutableListOf<String>()
    source.split(" ").forEach { name ->
        val sourceChar = name.get(0).uppercase()
        resultList.add(sourceChar)
    }
    return resultList.joinToString("")
}
