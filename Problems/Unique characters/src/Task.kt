import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    print(sc.next().groupBy { it }.filter { it.value.size == 1 }.count())
}