package kotlinsPractice

import kotlin.random.*

fun main()
{

    val x :Int  = Random.nextInt(1..100);
//    println(x)

    var t  :Int  = 3;
var c : Int = 0
var a: Int = 0
        println("Enter a number")

    while (x!=a) {
         a = readln().toInt()
        if (x == a) {
            println("You won!")
        } else {
            println("Enter again")
            c += 1
            if(a>x)
            {
                println("Lesser")
            }
            else println("greater")
        }
        t -= 1
    }
    println("The lesser you score the more you win ! ")
    println("Your score is $c")

}
