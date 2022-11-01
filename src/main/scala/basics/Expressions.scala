package basics

object Expressions extends App{

  val x = 1 + 2
  var aVariable = 2
  aVariable += 3
  println(x)

  println(1 == x)

  //IF
  val aCondition = true
  val aConditionValue = if(aCondition) 5 else 3
  println(aConditionValue)

  //EVERYTHING in Scala is expression
  val aWeirdValue = (aVariable = 3)
  println(aWeirdValue)

  val aCodeBlock = {
    val y = 2
    val z = y + 2

    if (z > 2) "hello" else "goodbye"
  }
}
