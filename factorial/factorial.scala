

object MyModule { 
  def factorial(n: Int): Int = {
    // tail position recursive calls
    // where the caller does nothing(literally nothing, not even arithmetic) except return a recursive call
    def go(n: Int, acc: Int): Int =
      if (n <= 0) acc
      else go(n-1, n*acc)
    
    go(n, 1) 

    /* 
    // non tail position recursive calls
    def go(n: Int, acc: Int): Int =
     if (n <= 0) 1
     else go(n-1)*n
    
    go(n)
    */
  }


  def main(Args: Array[String])
}
