package io.github.oneservermc.recrutiment.statictest

fun main() {

  runCatching {
    Class.forName("io.github.oneservermc.recrutiment.statictest.StaticTest")
  }.exceptionOrNull()?.printStackTrace()
  runCatching {
    Class.forName("io.github.oneservermc.recrutiment.statictest.StaticTest")
  }.exceptionOrNull()?.printStackTrace()
}