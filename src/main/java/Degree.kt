class Degree {
  fun getDegree(radian: Double): Double {
    return radian * 180.0 / Math.PI
  }
}

const val HANNKEI = 180.0

class Degree1 {
  fun getDegree(radian: Double): Double {
    if (radian < 0) throw IllegalArgumentException("radianは0以上である必要があります")
    if (radian > 2 * Math.PI) throw IllegalArgumentException("radianは2pi以下である必要があります")

    return radian * HANNKEI / Math.PI
  }
}
