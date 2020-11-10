fun main () {
    println("Enter the number you want:")
    val num = readLine()!!.toInt()
    //val num = 2

    for (i in 1.. 10) {
      val product = num * i

        println("$num * $i = $product")

    }
}