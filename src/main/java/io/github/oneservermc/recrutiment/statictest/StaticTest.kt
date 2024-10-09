package io.github.oneservermc.recrutiment.statictest

object StaticTest {
  val a = let {
    if (true)
      throw Exception("aaaaaaa")
    else ""
  }

  init {
    println("a")
  }
}

