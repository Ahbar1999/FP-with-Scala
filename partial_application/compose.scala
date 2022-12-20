
object Module {

  def compose[A, B, C] (f: B => C, g: A => B): A => C = 
    (a: A): C => f(g(a)) 
}
