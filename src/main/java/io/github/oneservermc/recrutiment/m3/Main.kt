fun main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    val words = mutableSetOf<String>()
    while (true) {
        val line = readlnOrNull() ?: break
         words.addAll(line.split(" "))
    }
    println(cntTargetWordType(words))
    println()
}

fun cntTargetWordType(words: Set<String>): Int {
    var cnt = 0
    for (word in words) {
        if (word.first().isDigit()) {
            cnt++
            continue
        }
        if (word.first().isUpperCase()) {
            cnt++
            continue
        }
    }
    return cnt
}