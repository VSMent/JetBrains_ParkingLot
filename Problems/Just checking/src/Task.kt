import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val ints = IntArray(scanner.nextInt()) { scanner.nextInt() }
    val n = scanner.nextInt()
    val m = scanner.nextInt()
    for (i in 1..ints.lastIndex) {
        if (ints[i - 1] == n && ints[i] == m || ints[i - 1] == m && ints[i] == n) return println("YES")
    }
    println("NO")
}