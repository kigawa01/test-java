package io.github.oneservermc.recrutiment.kigawa

import java.net.URL
import java.util.*
import javax.net.ssl.HttpsURLConnection

class WebHook {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val url =
                URL("https://discordapp.com/api/webhooks/1044671514097758291/pVa_AuWcsc1cks0XVVADCEbkgbdr9tnPpD9Yx7ROoqWqx3FFsLRyNW3TcMoftoum9eFs")
            val connection = url.openConnection() as HttpsURLConnection
            connection.addRequestProperty("Content-Type", "application/json")
            connection.doOutput = true
            connection.requestMethod = "POST"
            
            val stream = connection.outputStream
            stream.write("{\"content\":\"messageaaaaaaaaaaaaaaa\"}".toByteArray())
            stream.flush()
            stream.close()
            
            connection.inputStream.close()
            
            connection.disconnect()
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