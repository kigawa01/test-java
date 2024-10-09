import java.util.concurrent.Executors
import kotlin.math.abs
import kotlin.math.roundToInt

//
class Test {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            loop("")
        }

        private fun loop(str: String) {
            if (str.length <= 1) println(str)
            if (str.length >= 6) {
                val result = result(str)
                if (result == "えきむっごきへで") println(result)
                return
            }
            if (str.length <= 2)
                chars.forEach {
                    executor.execute { loop(str + it) }
                }
            chars.forEach {
                loop(str + it)
            }
        }

        private val executor = Executors.newFixedThreadPool(100)

        private const val hashLength = 8;

        private const val chars = "あぃいぅうぇえぉおかがきぎくぐけげこごさざしじすずせぜそぞただちぢっつづてでとどなにぬねのはばぱひびぴふぶぷへべぺほぼぽまみむめもゃやゅゆょよらりるれろゎわゐゑをん"
        fun result(pass: String): String {
            var password = pass
            if (password.length < hashLength) {
                val insufficiency = hashLength - password.length;
                var extendedPassword = password
                var current = 0
                for (i in 0 until insufficiency) {
                    if (current >= password.length)
                        current = 0;
                    val charCode = password[current].code
                    val selectChar = if (charCode % 2 == 0)
                        charCode + insufficiency;
                    else charCode - insufficiency;
                    extendedPassword += chars[(selectChar.toDouble() % chars.length.toDouble()).roundToInt()];
                }
                password = extendedPassword;
            }
            var hash = 0;
            var hashChar = "-".repeat(hashLength);
            var j = password.length
            for (i in password.indices) {
                j--
                val hash1 = ((hash.shl(2)) - hash) + password[i].code;
                val hash2 = ((hash.shl(4)) - hash) + password[j].code;
                val hashIndex = ((hash.shl(6)) - hash) + chars.indexOf(password[i]);
                hash = hash1.xor(hash2).xor(hashIndex)
                hash = hash.and(0x7fffffff)
                val calculatedHashChar = chars[abs(hash) % chars.length];
                var putPos = hash % hashLength;
                if (hashChar[putPos] != '-')
                    putPos = hashChar.indexOf("-");
                if (putPos == -1)
                    putPos = hash % hashLength;
                hashChar = hashChar.substring(0, putPos) + calculatedHashChar + hashChar.substring(putPos + 1);
            }
            return hashChar
        }
    }
}