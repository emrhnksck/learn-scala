package basics

object StringOps extends App{

  val str: String = "Hello, I am learning Scala!"

  println(str.charAt(2))
  println(str.substring(7, 11))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ", "-"))

  val aNumberString = "35"
  val aNumber = aNumberString.toInt
  println('e'+: aNumberString :+ 'z' )
  println(str.reverse)
  println(str.take(2))

  //Scala-spesific: String interpolators.

  //S-interpolators
  val name = "Emrehan"
  val age = "12"
  val greeting = s"Hello, my name is $name and $age years old"

  val speed = 1.2f
  val myth = f"$name can eat $speed%2.2f burgers per minute"
  println(myth)
}
