//#lesson_26 (Visibility Modifiers)
//** public and protected and private follow the same role in variable and functions
open class operations {
//** the function is public by defult so that's why you can access it by the class who inherit it and also access it in main fun " that mean the instance from class in main fun "
    //** but if we declear it as protected it can be access inside the class itself and in class how inherit it as well but can't access it in main fun " the instance can't access it"
   protected fun sum (n1:Double,n2:Double):Double {
        return n1 + n2
    }

   private fun sub (n1:Double,n2:Double):Double {//** but if we declear it private we can access it inside the class only nothing else can access it
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
