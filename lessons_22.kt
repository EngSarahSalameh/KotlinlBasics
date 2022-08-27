var name = "Sarah Salameh Public" //** public variable you can access it from any block

fun main(args: Array<String>){

//#lesson_22 (variables scope)
    var name = "Sarah Salameh" //** only this block can see variable name
    //** to make the variable public define it above all functions
    showName()
}
fun showName () {
    println(name) //** here we can't access the variable name from fun main because it defines locally inside main fun
    //** the value of name is coming from the public name above not from fun main
    var age = 22
    println(age)
}

