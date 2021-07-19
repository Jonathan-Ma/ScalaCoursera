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
    def pascal(col: Int, row: Int): Int =
      if (col == 0 || col == row) 1 else pascal(col, row - 1) + pascal(col - 1, row - 1)
  
  /**
   * Exercise 2 made some change
   *
   *
   */
  def balance(chars: List[Char]): Boolean = chars.foldLeft(0){
    case (0, ')') => return false
    case (x, ')') => x - 1
    case (x, '(') => x + 1
    case (x, _  ) => x
  } == 0


  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int =
      if(coins == 0) 0
  }
