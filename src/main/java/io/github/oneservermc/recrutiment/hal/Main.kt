package io.github.oneservermc.recrutiment.hal

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.asCoroutineDispatcher
import kotlinx.coroutines.launch
import java.math.BigInteger
import java.util.concurrent.Executors


object Main {
  val scope = CoroutineScope(Executors.newFixedThreadPool(16).asCoroutineDispatcher())
  val list = mutableListOf<String>()
  val chars = listOf<Char>(
//    *('a'..'z').toList().toTypedArray(),
    *('A'..'Z').toList().toTypedArray(),
    ' '
  )
  val src = "1016038658490104961427424829192107777586657527054493152248037795359031107804956764751901815526799202142850229155862345366185195252956012941764965047026450856177019505967863789072653967766593112749"
  val srcI = BigInteger(src)
  val nums = listOf(
    BigInteger(
      "6864797660130609714981900799081393217269435300143305409394463459185543183397656052122559640661454554977296311391480858037121987999716643812574028291115057151"
    )
  )

  fun find(): MutableList<BigInteger> {
    val list = mutableListOf<BigInteger>()
    var number = srcI

    var devideNum = BigInteger.TWO
    while (number % devideNum == BigInteger.ZERO) {
      list.add(devideNum)
      number /= BigInteger.TWO
    }

    devideNum++
    while (number != BigInteger.ONE) {
      if (number % devideNum == BigInteger.ZERO) {
        list.add(devideNum)
        number /= devideNum
      } else {
        devideNum += BigInteger.TWO
      }
    }
    return list
  }
//  fun find(): MutableList<BigInteger> {
//    var num: BigInteger = srcI
//    val list = mutableListOf<BigInteger>()
//
//    while (true) {
//      var i = BigInteger.TWO
//      while (true) {
//        val result = num.divideAndRemainder(i)
//        if (result[1] == BigInteger.ZERO) {
//          num = result[0]
//          list.add(i)
//          println("$i $num")
//          break
//        }
//        if (result[0] < i) return list
//        i++
//      }
//    }
//  }

  @JvmStatic
  fun main(args: Array<String>) {
    nums.forEach {
      val a = srcI / it
      println(bytestoStr(a.toByteArray()))
    }
  }

//  @JvmStatic
//  fun main(args: Array<String>) {
//
//    val min = ByteArray(16)
//    val max = ByteArray(16)
//    for (i in 0..15) {
//      min[i] = 32
//      max[i] = 90
//    }
//    val minI = BigInteger(min)
//    val maxI = BigInteger(max)
//
//    var i = minI
//    println(srcI / minI)
//    println(srcI / maxI)
//    println((srcI / minI) - (srcI / maxI))
//
//    chars.forEach { n1 ->
//      if (n1 == ' ') return@forEach
//      chars.forEach n16@{ n16 ->
//        if (n16 == ' ') return@n16
//        chars.forEach { n2 ->
//          chars.forEach { n3 ->
//            chars.forEach { n4 ->
//              chars.forEach { n5 ->
//                chars.forEach { n6 ->
//                  chars.forEach { n7 ->
//                    chars.forEach { n8 ->
//                      chars.forEach { n9 ->
//                        chars.forEach { n10 ->
//                          chars.forEach { n11 ->
//                            chars.forEach { n12 ->
//                              chars.forEach { n13 ->
//                                chars.forEach { n14 ->
//                                  chars.forEach last@{ n15 ->
//                                    val bytes = byteArrayOf(
//                                      n1.code.toByte(),
//                                      n2.code.toByte(),
//                                      n3.code.toByte(),
//                                      n4.code.toByte(),
//                                      n5.code.toByte(),
//                                      n6.code.toByte(),
//                                      n7.code.toByte(),
//                                      n8.code.toByte(),
//                                      n9.code.toByte(),
//                                      n10.code.toByte(),
//                                      n11.code.toByte(),
//                                      n12.code.toByte(),
//                                      n13.code.toByte(),
//                                      n14.code.toByte(),
//                                      n15.code.toByte(),
//                                      n16.code.toByte(),
//                                    ).reversed().toByteArray()
//                                    val num = BigInteger(bytes)
//                                    val a = srcI.divideAndRemainder(num)
//                                    println("${a[0]} ${a[1]} $num ${bytestoStr(bytes)}")
//                                    if (a[1] != BigInteger.ZERO) return@last
//                                    println("zero remainder: ${a[0]} $num ${bytestoStr(bytes)}")
//                                    if (!isPrime(a[0])) return@last
//                                    println("result: ${a[0]} $num ${bytestoStr(bytes)}-----------------------------")
//
//                                  }
//                                }
//                              }
//                            }
//                          }
//                        }
//                      }
//                    }
//                  }
//                }
//              }
//            }
//          }
//        }
//      }
//    }
//  }
//  @JvmStatic
//  fun main(args: Array<String>) {
//    val src = "1016038658490104961427424829192107777586657527054493152248037795359031107804956764751901815526799202142850229155862345366185195252956012941764965047026450856177019505967863789072653967766593112749"
//    val srcI = BigInteger(src)
//    val min = ByteArray(16)
//    val max = ByteArray(16)
//    for (i in 0..15) {
//      min[i] = 0
//      max[i] = 127
//    }
//    min[0] = 1
//    val maxI = BigInteger(max)
//    var i = BigInteger(min) + BigInteger.ONE
//    while (true) {
//      if (i > maxI) break
//      a(srcI, i)
//      i++
//    }
//    println("aaa")
//    println(list)
//    while (scope.isActive) {
//      runBlocking {
//        delay(10000)
//      }
//    }
//  }

//  fun a(srcI: BigInteger, i: BigInteger) {
//    scope.launch {
//      val a = srcI.divideAndRemainder(i)
//      if (a[1] == BigInteger.ZERO) return@launch
//      println("zero remainder: ${a[0]} $i ${bytestoStr(i.toByteArray())}")
//      if (!isPrime(a[0])) return@launch
//
//      println("result: ${a[0]} $i ${bytestoStr(i.toByteArray())}-----------------------------")
//    }
//  }
//  @JvmStatic
//  fun main(args: Array<String>) {
//    val bytes = ByteArray(3)
//    bytes[2] = 'A'.code.toByte()
//    bytes[1] = 'B'.code.toByte()
//    bytes[0] = 'C'.code.toByte()
//    println('A'.code)
//    val res = mutableListOf<Byte>()
//    println(BigInteger(bytes))
//    printBytes(BigInteger(bytes).toByteArray())
//    val src = "1016038658490104961427424829192107777586657527054493152248037795359031107804956764751901815526799202142850229155862345366185195252956012941764965047026450856177019505967863789072653967766593112749"
//
//    val srcI = BigInteger(src)
//    printBytes(srcI.toByteArray())
//    println(srcI)
//    var i = srcI.divide(2.toBigInteger())
//    while (true) {
//      run(i, srcI)
//      i--
//      if (i < BigInteger.ZERO) break
//    }
//    println("end")
//    while (scope.isActive) {
//      runBlocking {
//        delay(10000)
//      }
//    }
//  }

  fun run(i: BigInteger, srcI: BigInteger) {
    scope.launch {
      if (isPrime(i)) {
        val nums = srcI.divideAndRemainder(i)
//        println(nums.toList())
        if (nums[1].equals(BigInteger.ZERO)) {
          println(nums.toList())
          bytestoStr(nums[0].toByteArray())
        }
      }
    }
  }

  fun bytestoStr(bytes: ByteArray): String {
    return bytes.reversed().map {
      it.toInt().toChar()
    }.joinToString(separator = "")
  }

  fun isPrime(num: BigInteger): Boolean {
    var i: BigInteger = num.divide(BigInteger.TWO)
    while (true) {
      if (num.remainder(i) == BigInteger.ZERO) {
        return false
      }
      if (i <= BigInteger.TWO) return true
      i--
    }
  }
}


