package io.github.oneservermc.recrutiment.arc.config

import io.github.oneservermc.recrutiment.arc.quest.Quest

class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            Quest(QuestLoaderImpl())
        }
    }
}