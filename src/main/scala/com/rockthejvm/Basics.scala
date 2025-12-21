package com.rockthejvm

object Basics extends App {
    val meaningOfLife:Int = 42
    val aBoolean = false
    val aString = "I love Scala"
    val aComposedString = "I" + " " + "love" + " " + "Scala"
    val anInterpolatedString = s"The meaning of life is $meaningOfLife"

    val anExpression = 2 + 3
    val ifExpression = if (meaningOfLife > 43) 56 else 999
    val chainedExpression = 
        if (meaningOfLife > 43) 58
        else if (meaningOfLife < 0) -1
        else 999
    

    val aCodeBlock = {
        val localVal = 27
        localVal + 3
    }

    def myFunction(x:Int, y:String): String = {y + " " + x}

    def factorial(n: Int): Int = {
        if (n <= 1) 1
        else n * factorial(n-1)

    }
}
