package OOP

object AbstractDataTypes extends App{

  //abstract members

  abstract class Animal{
    val creatureType: String = "wild"
    def eat: Unit
  }

  class Dog extends Animal {
    override val creatureType: String = "Canine"
    def eat: Unit = println("crunch crunch")
  }

  trait Carnivore {
    def eat(animal: Animal): Unit
    val preferredMeal:String = "fresh meat"
  }

  class Crocodile extends Animal with Carnivore{
    override val creatureType: String = "croc"
    def eat: Unit = println("nomnomnom")
    def eat(animal: Animal): Unit = println(s"I'm croc and im eating ${animal.creatureType}")
  }
  val dog = new Dog
  val croc = new Crocodile
  croc.eat(dog)

  /*raits vs abtsract classes
    trait do not have constructor parameters
    multiple traits may be inherited by the same class
    traits are behavior, abstract class = "thing"
  * */

}
