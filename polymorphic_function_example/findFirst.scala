

object MyPolymorphicFunction { 
    
    // checks if an element exists in an array of general type and returns its index otherwise -1 
    def findFirst[A] (as: Array[A], p: A => Boolean): Int = {
      // this annotation helps compiler make some space optimizations
      // it converts recursive functions into a while loop hence saving stack space
      @annotation.tailrec
      def loop(n: Int): Int = 
        // if array exhausted
        if (n >= as.length) -1 
        // if found
        else if (p(as(n))) n 
        // keep going forward
        else loop(n + 1)

      // start from 0 index
      loop(0)
    }




}
