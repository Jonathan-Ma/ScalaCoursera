package recfun

object Main {
  def main(args: Array[String]): Unit = {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(s"${pascal(col, row)} ")
      println()
    }
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int =
      if(c == r || c == 0) 1 else pascal(c, r - 1) + pascal(c - 1, r - 1)
  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = chars.foldLeft(0){
      case (0, ')') => return false
      case (x, '(') => x + 1
      case (x, ')') => x - 1
      case (x, _) => x
    }
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int =
      if(money == 0) 1
      else if(money > 0 && coins.nonEmpty)
        countChange(money - coins.head) + countChange(money, coins.tail)
      else
        0
  }
