object Fibonacci {

  def fib(n: Int): Int = {
    // local tail recursive function 
    def go(n: Int, a: Int, b: Int): Int = {
      // when n >= 1, we will actually never reach the first case
      // the first case will only be reached for go(0)
      if (n == 0) a
      // this program will always terminate at the second case for n >= 1
      else if (n == 1) b
      else go(n - 1, b, a + b)
    }
    
    // note that n has no use in the above go() function except for working like a loop variable
    // to run the calculations for n number of times
    go(n, 0, 1)
  }


  def main(args: Array[String]): Unit = {
    println(fib(1)) 
    println(fib(3))
    println(fib(5))
    println(fib(6))
  }
}
