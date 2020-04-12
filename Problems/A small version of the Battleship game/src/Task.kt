import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val x = IntArray(5) { it + 1 }
    val y = IntArray(5) { it + 1 }
    repeat(3) {
        x[input.nextInt() - 1] = 0
        y[input.nextInt() - 1] = 0
    }
    println(x.filter { it != 0 }.joinToString(" "))
    println(y.filter { it != 0 }.joinToString(" "))
}