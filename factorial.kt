fun main() {
    val n = 10
   var i = 1
    var fact:Long = 1
    while (i <= n) {
        fact *= i.toLong()
        i++
        println(fact)

    }

   /* for (i in 1..n) {
        fact *= i.toLong()
    }
    println(fact)*/
}
