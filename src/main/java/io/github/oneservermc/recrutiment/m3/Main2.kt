import kotlin.math.roundToInt

fun main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    val line = readlnOrNull() ?: throw IllegalArgumentException("Invalid input. need titles.")
    val items = createItems(line.split(","))
    while (true) {
        val line = readlnOrNull() ?: break
        items.addScores(line.splitScores())
    }
    items.printTitles()
    items.printAverages()
}

fun List<Item>.printAverages() {
    println(joinToString(",") { it.average().toString() })
}

fun List<Item>.printTitles() {
    println(joinToString(",") { it.title })
}

fun String.splitScores() = split(",").map {
    it.toIntOrNull() ?: throw IllegalArgumentException("Invalid input. need numbers.")
}


fun List<Item>.addScores(scores: List<Int>) {
    if (size != scores.size) throw IllegalStateException("title and score size not match")
    for (i in indices) {
        this[i].addScore(scores[i])
    }
}

fun createItems(titles: List<String>) = titles.map { Item(it) }

data class Item(
    val title: String,
) {
    private val scores = mutableListOf<Int>()
    fun addScore(score: Int) {
        scores.add(score)
    }

    fun average(): Int {
        return scores.average().roundToInt()
    }
}
