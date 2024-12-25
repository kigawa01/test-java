package io.github.oneservermc.recrutiment.arc.quest

class Quest(
    private val loader: QuestLoader,
) {
    init {
        loader.load()
    }
}