//#lesson_29 (Inner and Nested)
//** we can have class inside other class (Nested class) each of them can have properties and functions
 class outer {
    val name:String = "Sarah Salameh"

       inner class innerr {
           
        fun getMsg ():String {
            return "Kotlin is very fun language"
        }

        fun getName ():String {
            return name //** to access data from the outer class you have to write "inner" keyword in front of inner class. Otherwise, will give you error
            //** inner keyword mean I want to access outer class data and after using inner class keyword creating instance from inner class will give you error
        }
    }
}

fun main() {
        var outOb = outer() //** creating instance from outer class

        var innerOb = outer.innerr() //** creating instance from inner class "you have to write the outer class name first then, dot then inner class name"
        println(innerOb.getMsg())

}
