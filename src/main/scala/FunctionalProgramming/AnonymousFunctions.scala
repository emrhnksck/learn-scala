package FunctionalProgramming

object AnonymousFunctions extends App{
  //LAMBDA
  val doubler:Int => Int = x => x * 2

  //multiple params in labmda
  val adder:(Int,Int) => Int = (a,b) => a + b

  //no params
  val justDoSomething: () => Int = () => 3


  println(justDoSomething) //function itself,doesnt print
  println(justDoSomething()) //call

  //curly braces with lambdas
  val stringToInt = { (str: String) =>
    str.toInt
  }

  //MOAR syntatic sugar
  val niceIncrementer: Int => Int = _ + 1 //equivalent to x => x + 1
  val niceAdder: (Int,Int) => Int = _ + _ //equivalent to (a,b) => a+b


}
