//#lesson_28 (Interface)
//** IF we have collection of functions and each of these functions will implement in different way in classes , we use (interface)
interface operation { //** to declare interface
    fun sum (n1:Double,n2:Double)
    fun sub (n1:Double,n2:Double)
}

class userOperation:operation { //** :operation mean we implement interface operation , and to implement it you have to implement that interface functions otherwise will give error
    override fun sum(n1: Double, n2: Double) {
        println("User : " + ( n1 + n2 ))
    }

    override fun sub(n1: Double, n2: Double) {
        println("User : " + ( n1 - n2 ))
    }

}

class adminOperation:operation {
    override fun sum(n1: Double, n2: Double) { //** another class implement operation interface , but with different functions implementation
        println("Admin : " + ( n1 + n2 ) )
    }

    override fun sub(n1: Double, n2: Double) {
        println("Admin : " + ( n1 - n2 ))
    }

}

fun main(args:Array<String>) {

    var userOp = userOperation()
    userOp.sub(20.0,10.0)
    userOp.sum(20.0,10.0)

    var adminOp = adminOperation()
    adminOp.sub(20.0,10.0)
    adminOp.sum(20.0,10.0)


}
