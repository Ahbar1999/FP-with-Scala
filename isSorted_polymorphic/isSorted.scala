// Excercise 2.2

object Module_IsSorted { 
  
  // takes a generic array, and a function that determines the order of any two elements in it
  def isSorted[A] (as: Array[A], ordered: (A, A) => Boolean): Boolean = {
    
    @annotation.tailrec
    def go(index: Int): Boolean = 
      if (index >= as.length - 1) true
      else if (!ordered(as(index), as(index + 1))) false
      else go(index + 1)
    
    // return the result of this call
    go(0)
  }

  
  // mandatory main method
  def main(args: Array[String]): Unit = {  
    println(isSorted(Array(1, 2, 3, 4, 5), (a: Int, b: Int) => a <= b))
    println(isSorted(Array(1, 2, 3, 1, 5), (a: Int, b: Int) => a <= b))
  }


} 
