fun main() {
    val ch = '/'
/*
    if (ch in 'a'..'z' || ch in 'A'..'Z') //(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z')
        println("Is alphabet")
    else
        println("Not alphabet")
*/
    when {
        (ch in 'a'..'z' || ch in 'A'..'Z') -> println("Is alphabet")
        else-> println("Not alphabet")
    }
}