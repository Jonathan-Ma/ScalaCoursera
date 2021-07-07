package recfun

import common.BaseScalaSpec

class CountChangeSuite extends BaseScalaSpec {
  import Main.countChange

  "countChange" should {
    "countChange: example given in instructions" in {
      assert(countChange(4,List(1,2)) === 3)
    }

    "countChange: sorted CHF" in {
      assert(countChange(300,List(5,10,20,50,100,200,500)) === 1022)
    }

    "countChange: no pennies" in {
      assert(countChange(301,List(5,10,20,50,100,200,500)) === 0)
    }

    "countChange: unsorted CHF" in {
      assert(countChange(300,List(500,5,50,100,20,200,10)) === 1022)
    }
  }

}
