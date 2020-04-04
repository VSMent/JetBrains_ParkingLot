import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val incomes = IntArray(n) { scanner.nextInt() }
    val taxPercents = IntArray(n) { scanner.nextInt() }
    var maxTax = 1
    for (i in 1..incomes.lastIndex) {
        if (incomes[i - 1] * taxPercents[i - 1] < incomes[i] * taxPercents[i]) {
            maxTax = i + 1
        }
    }
    print(maxTax)
}