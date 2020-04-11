import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val c = scanner.next()[0]
    print(c.isUpperCase() || c.isDigit() && c != '0')
}