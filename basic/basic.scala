
// A comment ! 
/* Another comment */
/** A documentation comment **/

// we could have used a class but we need a singleton object
/*
  The interpreter will look for any
  object within this file(at the highest level in code) that has a main method with the appropriate
  signature, and will then call it.
  If there are two objects with a main method then the one appearing first 
  in the code will be executed
*/

object MyModule { 
  // we dont need a return keyword 
  // end evaluated value is returned 
  def abs(n: Int): Int = if (n < 0) -n else n
      
  // a private method can only be called by fellow members of the object
  private def formatAbs(x: Int) = {
    val msg = "The absolute value of %d is %d"
    msg.format(x, abs(x))
  }
  
  // this is a function or a procedure that has side effects
  // it calls the pure functions but itself is not a pure function
  // it works as an interface to the pure functions
  // Scala be default looks for a 'main' function(with this exact signature) like c languages 
  def main(args: Array[String]): Unit = 
    println(formatAbs(-42))

}



