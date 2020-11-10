fun  main() {
    val num = 50
    var sum = 0
    /*for (i in 1..num){
        sum += i
        println(sum)
    }*/
    // using while loop
    var i = 1
    while ( i <= num){
        sum += i
        i++
        println(sum)
    }
}