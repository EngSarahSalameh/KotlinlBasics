//#lesson_27 (Overriding)
//** If the class inherit another class but need to do different implementation to specific function , in this case we use override
open class operations {

    fun sum (n1:Double,n2:Double):Double {
        return n1 + n2
    }

   open fun sub (n1:Double,n2:Double):Double { //** The purpose of using open keyword here because we will override it below
        return n1 - n2
    }
}

class multiOperations () : operations (){

    fun div (n1:Double,n2:Double):Double {
        return n1 / n2
    }

    fun mul (n1:Double,n2:Double):Double {
        return n1 * n2
    }

   override fun sub (n1:Double,n2:Double):Double { //** for example, we need to do different implementation to sub fun , so two things you have to do : write open in front of function you will override , write override if front of overridden fun
       //** if we want to call sub of the parent class we use keyword (super).To call something in current class we use (this) keyword and to call something in parent class we use (super) keyword
        super.sub(n1, n2)
        return n1 - n2 + 5
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
