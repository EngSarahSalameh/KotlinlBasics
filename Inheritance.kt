//#lesson_25 (Class Inheritance)
open class operations {

    fun sum (n1:Double,n2:Double):Double {
        return n1 + n2
    }

    fun sub (n1:Double,n2:Double):Double {
        return n1 - n2
    }
}

class multiOperations () : operations (){ //** : operations mean inherit class operations , and the class we inherit from it have to be open, so we put open keyword before class keyword in that class
    //** to inherit from class you have to call constructor of both classes , so that's why we wrote multiOperations () : operations () "() mean calling constructor"

    fun div (n1:Double,n2:Double):Double {
        return n1 / n2
    }

    fun mul (n1:Double,n2:Double):Double {
        return n1 * n2
    }
}

fun main(args:Array<String>) {
        var op = operations()
    println(op.sum(10.0 , 12.0))
    println(op.sub(12.0 , 10.0))

    var mulop = multiOperations()
    println(mulop.div(10.0 , 2.0))
    println(mulop.mul(10.0 , 2.0))
    println(mulop.sum(10.0 , 2.0))
    println(mulop.sub(10.0 , 2.0))
}
