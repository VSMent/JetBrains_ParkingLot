import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val ints = IntArray(scanner.nextInt())
    for (i in 0..ints.lastIndex) {
        ints[i] = scanner.nextInt()
    }
    print(if (scanner.nextInt() in ints) "YES" else "NO")
}