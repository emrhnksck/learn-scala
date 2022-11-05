package basics

object CBNvsCBV extends App {

  //VALUE IS COMPUTED BEFORE CALL SAME VALUE USED EVERYWHERE
    def calledByValue(x: Long): Unit = {
      println("by value " + x)
      println("by value " + x)
    }

  //EXPRESSION IS EVALUATED AT EVERY USE WITHIN
  def calledByName(x: => Long): Unit = {
    println("by name " + x)
    println("by name " + x)
  }

  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())

}
