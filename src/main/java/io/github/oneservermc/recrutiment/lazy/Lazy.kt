//fun test() {
//    lazy { }
//}
//
//fun main() {
//    Dsl().e.block()
//}
//
//fun callBranch(brancFunc: () -> Branch) {}
//
//class Dsl {
//    val c: Branch by branch {
//        println("c")
//        d.block()
//    }
//    val d: Branch by branch {
//        println("d")
//        c.block()
//    }
//    val e: Branch by branch {
//        c.block()
//    }
//
//    fun a(): Branch = Branch {
//        callBranch(::b)
//    }
//
//    fun b() = Branch {
//        callBranch(::a)
//    }
//}
//
//fun branch(block: () -> Unit): BranchWrapper {
//    return BranchWrapper(block)
//}
//
//class BranchWrapper(block: () -> Unit) : Lazy<() -> (() -> Unit)> {
//
//    override val value: () -> (() -> Unit) = { block }
//
//    override fun isInitialized(): Boolean {
//        return true
//    }
//}
//
//class Branch(
//    val block: () -> Unit,
//)
//
