//#lesson_30 (Try Catch)
//** To avoid crash the program when Exception happen we use try catch
fun main() {

        val n1 = 10
        val n2 = 0
        val n3 = 12

       val sum = n1 + n2 + n3
       println("Sum Equal = $sum")

       val sub = n1 - n2 - n3
       println("Sub Equal = $sub")

    try { //** we know this block of code properly give an error, so we put it inside try curly brackets
        //** try mean try to execute this block of code and if you do it, it's ok, but if you can't do it, don't crash the program just tell me what happen in "catch" block of code
       val div = n1 / n2 / n3
       println("Div Equal = $div")
        }
    catch (ex:Exception){
      println("The Error Is : " + ex.message)
     }
       val mul = n1 * n2 * n3
       println("Mul Equal = $mul")
}
