package FunctionalProgramming

object HighOrderFunctions extends App {
  def nTimes(f: Int => Int,n: Int, x: Int):Int = {
    if( n<= 0) x
    else nTimes(f,n-1,f(x))
  }

  val plusOne = (x:Int) => x + 1
  println(nTimes(plusOne,10,1))

  def nTimesBetter(f: Int => Int,n: Int): (Int => Int) = {
    if(n <= 0) (x: Int) => x
    else (x:Int) => nTimesBetter(f,n-1)(f(x))
  }
  val pls10 = nTimesBetter(plusOne,10)
  println(pls10)
}
