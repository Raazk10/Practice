fun main () {
    println("Enter the number you want:")
    val num = readLine()!!.toInt()
    //val num = 2

    for (i in 1.. 10) {     // while (i <= 10)  in line 9 i++
      val product = num * i

        println("$num * $i = $product")

    }
}