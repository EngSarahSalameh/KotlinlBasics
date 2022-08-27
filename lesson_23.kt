//#lesson_23 (Simple Class)

//class car (type:String,model:Int,price:Double,milesDrive:Int,owner:String) { //** To pass parameter to class "This is one of ways to create constructor"

  //  init { //** this function called automatically when you create instance from the class
   //     println("type $type")
   //     println("model $model")
    //    println("price $price")
    //    println("milesDrive $milesDrive")
     //   println("owner $owner")
   // }

    //fun getPrice () : Double? { //** ? mean the function can return null as well
    //   return price //** Using this class design we can't access price parameter because we defined the parameter in a constructor and this function can't access constructor parameter, will use design car2
   // }
//}


class car2 {
    //** ? = null mean this parameter can have value and can be null as well
    var type:String? = null //** using this desgin we made the paramter public in the class "we can access it in any function in this class"
    var model:Int? = null
    var price:Double? = null
    var milesDrive:Int? = null
    var owner:String

    constructor(type:String,model:Int,price:Double,milesDrive:Int,owner:String){
        println("type $type")
        this.type = type //** mean the type in this class make it equal to coming type and the same for all paramter
        println("model $model")
        this.model = model
        println("price $price")
        this.price = price
        println("milesDrive $milesDrive")
        this.milesDrive = milesDrive
        println("owner $owner")
        this.owner = owner
    }

    fun gettPrice () : Double?{ //** getPrice will consider part from geter and seter which is defined in system
       return this.price!! - ( this.milesDrive!!.toDouble() * 10 ) //** milesDrive is Int, so we convert it to double becuase the return data type is double and if we don't convert it this will give error
     }

    fun gettOwner () : String?{
        return this.owner!!
    }

}

fun main (args:Array<String>){
    var mycar = car2("BMW" , 2022 , 1000000.0 , 900 , "Sarah Salameh") //** create instance from car2 class and pass parameter value
    println("Car Price : " + mycar.gettPrice())
    println("Car Owner : " + mycar.gettOwner()) //** this will return Sarah Salameh
    println("Car Owner :  ${mycar.owner}") //** this will return Get type : Sarah Salameh
}
