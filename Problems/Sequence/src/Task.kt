import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val c = scanner.next()[0]
    print(c + 1 == scanner.next()[0] && c + 2 == scanner.next()[0])
}