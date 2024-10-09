package io.github.oneservermc.recrutiment.kigawa

class A(
  var a: Int,
  val b: String,
) {

  var aaa: String = "aaaaaaa"
    get() {
      println("get")
      return field
    }
    set(value) {
      println("set")
      field = value + "asdadsadsadad"
    }

  override fun toString(): String {
    return "A(a=$a, b='$b')"
  }

  fun up() {
    a++
  }

  fun get(): String {
    return "dsasdadasdsadasadas$a,$b"
  }
}