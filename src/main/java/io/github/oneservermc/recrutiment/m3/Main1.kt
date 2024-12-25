fun main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    val line = readlnOrNull() ?: throw IllegalArgumentException("Invalid input. need numbers")
    val result = mutableListOf<Int>()
    val strNums = line.split(",")
    if (strNums.isEmpty()) return

    var prev = convertToInt(strNums[0])
    for (i in 1..<strNums.size) {
        val strNum = strNums[i]
        val num = convertToInt(strNum)

        if (isMatch(i, num, prev)) result.add(num)
        prev = num
    }
    println(result.joinToString(","))
    println()
}

fun isMatch(index: Int, num: Int, prev: Int): Boolean {
    if (index % 2 == 1) return true
    return num == prev
}

fun convertToInt(str: String): Int {
    return str.toIntOrNull() ?: throw NumberFormatException("Invalid number: $str")
}
