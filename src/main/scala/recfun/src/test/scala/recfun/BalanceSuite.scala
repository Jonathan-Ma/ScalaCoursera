package recfun

import common.BaseScalaSpec

class BalanceSuite extends BaseScalaSpec {
  import Main.balance

  "balance" should {
    "'(if (zero? x) max (/ 1 x))' is balanced" in {
      assert(balance("(if (zero? x) max (/ 1 x))".toList))
    }

    "'I told him ...' is balanced" in {
      assert(balance("I told him (that it's not (yet) done).\n(But he wasn't listening)".toList))
    }

    "balance: ':-)' is unbalanced" in {
      assert(!balance(":-)".toList))
    }

    "balance: counting is not enough" in {
      assert(!balance("())(".toList))
    }
  }

}
