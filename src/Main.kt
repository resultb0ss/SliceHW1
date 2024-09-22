fun main() {
    var array: List<Int> = (1..20).toList()
    println(array.drop(5).count { it % 2 == 0 })
}