//package io.github.oneservermc.recrutiment.kigawa
//
//import kotlinx.coroutines.*
//import java.util.*
//
//object For {
//
//  @JvmStatic
//  fun main(args: Array<String>) {
//    val list = Collections.synchronizedList(
//      listOf(
//        "a",
//        "a",
//        "a",
//        "a",
//        "a",
//        "a",
//        "a",
//        "a",
//        "a",
//        "a",
//        "a",
//        "a",
//        "a",
//      )
//    )
//
//    val a = CoroutineScope(Dispatchers.Default).launch {
//      for (item in list) {
//        println("aaaa")
//        list.add("asdasd")
//        delay(1000)
//      }
//      list.forEach {
//        println("aaaa")
//        println(it)
//        delay(1000)
//      }
//    }
//    val b = CoroutineScope(Dispatchers.Default).launch {
//      for (item in list) {
//        println("bbbb$item")
//        delay(1000)
//      }
//      list.forEach {
//        println(it)
//        println("bbbb")
//        delay(1000)
//      }
//    }
//
//    a.start()
//    b.start()
//    runBlocking {
//      a.join()
//      b.join()
//    }
//  }
//}