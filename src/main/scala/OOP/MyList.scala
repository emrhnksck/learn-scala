package OOP

abstract class MyList {
  def head: Int
  def tail: MyList
  def isEmpty: Boolean
  def add(element: Int): MyList
}

object Empty extends MyList{
  override def head: Int = throw new NoSuchElementException

  override def tail: MyList = throw new NoSuchElementException

  override def isEmpty: Boolean = true

  override def add(element: Int): MyList = new Cons(element, Empty)
}

class Cons(h: Int,t: MyList) extends MyList{
  override def head: Int = h

  override def tail: MyList = t

  override def isEmpty: Boolean = false

  override def add(element: Int): MyList = new Cons(element, this)
}

object ListTest extends App{
  val list = new Cons(1, new Cons(2, new Cons(3,Empty)))
  println(list.tail.head)
  println(list.add(4).head)
}