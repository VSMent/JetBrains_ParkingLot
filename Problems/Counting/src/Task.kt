import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val arr = IntArray(n) { scanner.nextInt() }
    val m = scanner.nextInt()
    print(arr.count { it == m })
}