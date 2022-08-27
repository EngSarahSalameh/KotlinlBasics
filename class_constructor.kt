//#lesson_24 (Class constructor)
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

    constructor(){ //** we can have many constructor and create instance from any of them
        //** for example we can create constructor without parameter
        //** we can initialize the properties values if we want in the constructor
        this.type = "Verari"
        this.model = 2021
        this.price = 9999990.0
        this.milesDrive = 900
        this.owner = "Jana"
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

    var carSecondConstructor = car2()
    println("Car Price : " + carSecondConstructor.gettPrice())
    println("Car Owner : " + carSecondConstructor.gettOwner())

}
