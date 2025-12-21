package com.rockthejvm

object ObjectOrientation extends App {

    class Animal {
        val age:Int = 0
        def eat() = println("I'm eating.")
    }

    val anAnimal = new Animal

    class Dog(name:String) extends Animal {

    }
    val aDog = new Dog("Lassie")
    
    val aDeclaredAnimal = new Dog("Hachi")    
    aDeclaredAnimal.eat()

    abstract class WalkingAnimal {
        val hasLegs = true
        def walk(): Unit
    }

    trait Carnivore {
        def eat(animal:Animal): Unit
    }

    trait Philosopher {
        def ?!(thought:String): Unit
    } 

    class Crocodile extends Animal with Carnivore with Philosopher{
        override def eat(animal: Animal) = println("Croc is eating")
        override def eat(): Unit = super.eat()

        override def ?!(thought: String): Unit = println(s"Croc thinks: $thought")
    }

    val aCroc = new Crocodile
    aCroc.eat(aDog)
    aCroc eat aDog //infix notation
    aCroc ?! "What if we could fly?"

    val dinosaur = new Carnivore {
        override def eat(animal: Animal): Unit = println("Dino is eating")
    } 

    object MySingleton {
        val mySpecialValue = 27
        def mySpecialMethod(): Int = mySpecialValue
        def apply(x: Int): Int = x + 1
    }

    MySingleton.apply(65) // equivalent functions
    MySingleton(65)

    object Animal { // companion object
    //Singleton Animal and instances of Animal are different things
    val canLiveIndefinitely = false
    }

    val animalsCanLiveForever = Animal.canLiveIndefinitely

    case class Person(name: String, age: Int) {}

    

}
