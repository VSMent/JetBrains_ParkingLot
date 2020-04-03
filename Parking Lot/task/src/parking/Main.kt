package parking

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    var takenSlots = 1
    val command = sc.next()
    when (command) {
        "park" -> {
            sc.next()
            print("${sc.next()} car parked on the spot ${takenSlots + 1}.")
        }
        "leave" -> {
            val n = sc.nextInt()
            print(
                    if (n == takenSlots) "Spot $takenSlots is free."
                    else "There is no car in the spot $n."
            )
        }
    }
}