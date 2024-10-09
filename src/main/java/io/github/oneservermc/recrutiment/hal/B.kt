package io.github.oneservermc.recrutiment.hal

import io.github.oneservermc.recrutiment.hal.Main.isPrime
import io.github.oneservermc.recrutiment.hal.Main.scope
import kotlinx.coroutines.launch
import java.math.BigInteger

fun main() {

  val src = "1016038658490104961427424829192107777586657527054493152248037795359031107804956764751901815526799202142850229155862345366185195252956012941764965047026450856177019505967863789072653967766593112749"

  val srcI = BigInteger(src)
  var i = 1
  while (true) {
    run(i, srcI)
    i++;
    if (i.toBigInteger() > srcI) break
  }
}

fun run(i: Int, srcI: BigInteger) {
  scope.launch {
//    if (isPrime(i)) {
//      println("$i,")
//    }
  }
}
