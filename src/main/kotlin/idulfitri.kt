// create by herdo dimas pratirto

fun idulfitri() {

    for (i in 1..5) {
        for (k in 1..1) {
            print("* ")
        }
        println("*")
    }

    println(" ")

    for (s in 1..5) {
        for (l in 1..s) {
            print("* ")
        }
        println()
    }

    var count = 5
    for (a in count downTo 0) {
        count--
        for (g in count downTo 0) {
            print("* ")
        }
        println()
    }

    println(" ")

    var count2 = 1

    for (h in count2..5) {
        for (w in count2..4) {
            if (w == 3) {
                print("  ")
            }
            print("*")
        }
        println()
    }
    for (f in count2..6) {
        print("*")
    }

    

}


fun main(){

idulfitri()


}