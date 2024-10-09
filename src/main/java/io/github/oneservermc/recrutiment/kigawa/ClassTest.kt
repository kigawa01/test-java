package io.github.oneservermc.recrutiment.kigawa

class ClassTest(private val test: String): Parent() {
  companion object {
    @JvmStatic
    fun main(args: Array<String>) {
      println(
        ClassTest::class.java.declaredMethods.map {it.name}
      )
    }
  }
}

@Test
open class Parent() {
  private val aaaaaa: String = ""
  fun aaaa(){
  
  }
}

annotation class Test()