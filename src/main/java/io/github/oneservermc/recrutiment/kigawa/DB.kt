package io.github.oneservermc.recrutiment.kigawa

import java.sql.DriverManager
import java.sql.SQLException
import java.util.*

class DB {
  companion object {
    @JvmStatic
    fun main(args: Array<String>) {
      val url = "jdbc:mysql://localhost:3306/modmain"
      val user = "root"
      val password = "root"
      try {
        DriverManager.getConnection(url, user, password).use {con->
          con.prepareStatement("insert into modal values(?, ?)").use {preStatement->
            val sc = Scanner(System.`in`)
            preStatement.setString(1, "title")
            preStatement.setString(2, "message")
            val count = preStatement.executeUpdate()
            println("Successfully Finished.")
          }
        }
      } catch (e: SQLException) {
        e.printStackTrace()
        println("Error Occurred.")
      }
    }
  }
}
