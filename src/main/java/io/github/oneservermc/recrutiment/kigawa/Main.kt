package io.github.oneservermc.recrutiment.kigawa

import java.io.File
import java.nio.file.Files
import java.nio.file.Path

object Main {
  @JvmStatic
  fun main(args: Array<String>) {
    Runtime.getRuntime().exec(
      "\"C:\\Riot Games\\Riot Client\\RiotClientServices.exe\"", arrayOf(), File("C:/Riot Games/Riot Client")
    ).waitFor()
    Files.copy(
      Path.of("C:\\Users\\kigaw\\AppData\\Local\\Riot Games\\Riot Client\\Config\\RiotClientSettings.yaml"),
      Path.of("./a/config")
    )
    Files.copy(
      Path.of("C:\\Users\\kigaw\\AppData\\Local\\Riot Games\\Riot Client\\Data\\RiotGamesPrivateSettings.yaml"),
      Path.of("./a/data")
    )
  }
}