package io.github.oneservermc.recrutiment.kigawa

import java.util.Calendar
import java.util.concurrent.Executors

class Time {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val executorService = Executors.newFixedThreadPool(5)
            run("async") {
                executorService.submit {add()}.get()
            }
            run("sync") {
                add()
            }
            executorService.shutdownNow()
        }
        
        private fun add() {
            Calendar.getInstance()
        }
        
        private fun run(name: String, runnable: Runnable) {
            val start = System.nanoTime()
            
            runnable.run()
            
            val end = System.nanoTime()
            println("$name:\n   ${end - start}")
        }
    }
}