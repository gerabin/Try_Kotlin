/**
 * Created by pinko on 2017/5/24.
 */
class Test(var a: Int, var b: Int) {
    fun sum() = a + b
    fun max() = if (a > b) a else b
}

fun sum(a: Int, b: Int) = a + b

fun main(args: Array<String>) {
    //自定函數別名
    fun say(any: Any) = println(any)
    say(sum(5, 2))
    //字串內引運算
    println("${5 + sum(2, 8)}")
    //物件實作
    var t = Test(3, 8)
    t.a = 9
    //唯讀宣告
    val u = t
    u.a = 3
    u.b = 0
//    val v=u.copy()
    say(u.sum() + t.max())
    say(u.toString())
    val s = u.toString() + "haha${sum(2, 8) + Test(3, 4).sum()}"
    //for元素
    for (op in s) {
        print(op)
    }
    //for內定編號
    for (i in s.indices) {
        print(s[i])
    }
    //range
    var range = 1..5 step 2
    for (i in range) {
        say(i)
    }
    say(range.toString())
    range = 10 downTo 0 step 2
    say(range)

    //Array
    val names = arrayListOf<String>("adfsfa", "dfgdgs", "sdfasfds", "sdfasdfa", "dsfgasgfas")
    names.add("12345")
    //forEach...{it}
    names.forEach { print(it) }
    val n = names.map { it + "\n" }
    n.forEach { print(it) }
    println(2.toString())
    //Map
    val map = mapOf(1 to "one", 2 to "two")
    println(map)
    println(map.mapValues { (key, value) -> "$key -> $value" })
    map.keys.forEach {
        when (it) {
            is Int -> println("Int")
            1 -> println("1")
            2 -> println("2")
            else -> println("else")
        }
    }

    //lambda
    val fruits = listOf("banana", "avocado", "apple", "kiwi")
    fruits.filter { it.startsWith("a") }
            .sortedBy { it }
            .map { it.toUpperCase() }
            .forEach { println(it) }
    //lambda 函數型
    val f = { x: Float -> x * 3 / 2 - 5 }
    val f1 = { x: Float ->
        when (x) {
            in 10..20 -> x - 10
            in 30..40 -> 5
            else -> false
        }
    }
    say(f(5f))
    say(f1(32f))
    say(f1)
    fun f(x: Float): Float = x * 3 / 2 - 5
    val a: Float = (4 + 2).toFloat()
    println(f(a))
    val sumxy = { x: Int, y: Int -> x + y }
    var x = 5
    var y = 6
    say(f)
    say(f(3f))

    println(sumxy(x, y))

    //資料物件類別
    data class Customer(val name: String, val email: String)


}


