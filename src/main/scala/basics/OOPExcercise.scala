package basics

import java.time.Year

object OOPExcercise extends App {
  val author = new Writer("Charles","Dickens",1812)
  val imposter = new Writer("Charles","Dickens",1812)
  val novel = new Novel("Great Expectations",1861, author)

  println(novel.authorAge)
  println(novel.isWrittenBy(imposter))
  println(novel.isWrittenBy(author))

}

class Writer(val firstName: String,val surname: String,val year: Int){
  def fullName(): Unit = {
    println(this.firstName + " " + this.surname)
  }
}

class Novel(val name:String,val release: Int, val author:Writer){
  def authorAge(): Unit = println(Year.now.getValue - author.year)

  def isWrittenBy(author: Writer) = author == this.author

  def copy(novel: Novel): Novel = {
    val newRelease = new Novel(novel.name,Year.now().getValue, novel.author)
    return newRelease
  }
}

class Counter(val count: Int) {
  def inc = {
    println("incrementing")
    new Counter(count + 1)
  }

  def dec = {
    println("Decrementing")
    new Counter(count - 1)
  }



}