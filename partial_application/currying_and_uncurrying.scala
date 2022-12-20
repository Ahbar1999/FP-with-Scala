
object MyModule {
  
  // as args we are given a function 'f' that takes two arguments of type A, B
  // and returns a value of type C
  // We need to return a function takes as argument of type A and returns a function
  // that in turn takes an argument of type B and returns value of type C
  
  // Christopher Nolan ahhh beat :skull: 
  def curry[A, B, C](f: (A, B) => C): A => (B => C) = 
    // return the anonymous function 
    (a: A) => (b: B): C => f(a, b) 


  // does the inverse of the above operations
  def uncurrying[A, B, C](f: A => B => C): (A, B) => C = 

}
