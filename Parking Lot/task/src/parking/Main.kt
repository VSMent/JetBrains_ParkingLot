package parking

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val spots = Array(20) { "" }
    out@ while (sc.hasNextLine()) {
        val line = sc.nextLine().split(" ")
        when (line[0]) {
            "park" -> {
                for (i in spots.indices) {
                    if (spots[i].isEmpty()) {
                        println("${line[2]} car parked on the spot ${i + 1}.")
                        spots[i] = line[2]
                        break
                    } else if (i == spots.lastIndex) println("Sorry, parking lot is full.")
                }
            }
            "leave" -> {
                if (spots[line[1].toInt() - 1].isNotBlank()) {
                    println("Spot ${line[1]} is free.")
                    spots[line[1].toInt() - 1] = ""
                } else println("There is no car in the spot ${line[1]}.")
            }
            "exit" -> break@out
        }
    }
}