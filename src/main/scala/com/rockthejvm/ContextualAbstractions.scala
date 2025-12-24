package com.rockthejvm

object ContextualAbstractions extends App {

  val aList = List(2,1,4,3)
  val anOrderedList = aList.sorted

  given descendingOrdering: Ordering[Int] = Ordering.fromLessThan(_ > _)

  trait Combinator[A] {
    def combine(x: A, y: A): A
  }

  given intCombinator: Combinator[Int] = new Combinator[Int] {
    override def combine(x: Int, y:Int): Int = x + y
  }

  def combineAll[A](list: List[A])(using combinator: Combinator[A]): A = {
    list.reduce((a,b) => combinator.combine(a,b))
  }

  val theSum = combineAll(aList)

  /**
    * extensions
    */

  case class Person(name: String) {
    def greet(): String = s"Hi, I'm $name - nice to meet you!"
  }

  extension (string: String) {
    def greet(): String = new Person(string).greet()
  }
  
  val danielsGreeting = "Daniel".greet()
  println(danielsGreeting)

}
