package recfun

import common.BaseScalaSpec

class PascalSuite extends BaseScalaSpec {
  import Main.pascal

  "pascal" should {
    "pascal: col=0,row=2" in {
      assert(pascal(0,2) === 1)
    }

    "pascal: col=1,row=2" in {
      assert(pascal(1,2) === 2)
    }

    "pascal: col=1,row=3" in {
      assert(pascal(1,3) === 3)
    }
  }

}
