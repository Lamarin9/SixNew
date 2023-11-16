fun main() {

    println("Введите n: ")
    val x = readln().toInt()
    println("Введите x: ")
    val n = readln().toInt()
    val a = step(x, n)
    if (a != null) {
        println("a : $a")
    } else { println("Целочисленный показатель не существует")}
}
fun  step(x:Int,n:Int):Int? {
    var a = 0
    var power = 1
    while (power <= x) {
        if (power == x) {
            return a
        }
        a++
        power *= n
    }
    return null
}