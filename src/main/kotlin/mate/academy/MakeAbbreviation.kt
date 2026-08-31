package mate.academy

private const val FIRST_CHAR = 0

fun makeAbbr(source: String): String {
    val resultList = mutableListOf<String>()
    source.split(" ").forEach { name ->
        val sourceChar = name.get(FIRST_CHAR).uppercase()
        resultList.add(sourceChar)
    }
    return resultList.joinToString("")
}
