/**
 * Created by pinko on 2017/5/24.
 */
class Test(var a:Int,var b:Int) {
    fun sum()=a+b
    fun max()=if(a>b)a else b
}

fun main(args:Array<String>){
    fun say(any: Any) = println(any)
    say(sum(5,2))
    println("${5+sum(2,8)}")
    var t=Test(3,8)
    t.a=9
    val u=t
    u.a=3
    u.b=0
//    val v=u.copy()
    say(u.sum() +t.max())
    say(u.toString())
    val s = u.toString()+"haha${sum(2,8)}"
    for(op in s){
        print(op)
    }
    for(i in s.indices){
        print (s[i])
    }
    val range = 1..5 step 2
    for (i in range){
        say(i)
    }
    say(range.toString())
    val names = arrayListOf<String>("adfsfa", "dfgdgs", "sdfasfds", "sdfasdfa", "dsfgasgfas")
    names.add("12345")
    names.forEach { print(it) }
    val n = names.map { it+"\n" }
    n.forEach { print(it) }
    2.toString()
}


fun sum(a:Int,b:Int)=a+b
