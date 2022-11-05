package OOP

object OOBasics extends App {

  val person = new Person("Emrehan",22)
  println(person)
  println(person.greet("Emrehan"))

}

class Person(val name: String, val age: Int) {

  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")
  //overloading
  def greet(): Unit = println(s"Hi, I am $name")

  def this (name: Sting) = this(name,0)
}
//class parameters is not fields