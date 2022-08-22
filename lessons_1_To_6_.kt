
//** note : Kotlin is case sensitive
//** your program start from "main function"
fun main(args: Array<String>) {

    //#lesson_1
   println("Hello Eng.Sarah Salameh")  //**after excute make curser in the new line
   print("Enjoy learning kotlin\n") //**new line using \n
   print(100) //**without new line

   //#lesson_2 (data types)
    val name = "Sarah" //** val mean read only you cant edit it later

   var engName = "Sarah Salameh" //** you can edit var value later
    var engAge = 22
    var engDep = "Computer Science"
    engAge = 23

    var engGender:String = "Female" //** to declear variable with specific data type "you cant assign data from different data type"
    var engPhone: Int = 2 //** here  for example cant assign decimal becase its int
    var engSalary: Double = 250000.50

    var engExperinceYear:Int //to declear variable without assing value to it you have to determine its type otherwise will give you error
    engExperinceYear = 5


    //#lesson_3 (Null safety)
    var nameNotAcceptNull:String //** if you decleared var like this it will give you error if you try to print it without assiging value because its not accept null
    var nameAcceptNull:String?= null //** "?= null" this mean that the variable accept value and also null
    print(nameAcceptNull) //** will print null
    nameAcceptNull = "Its have value now"
    println(nameAcceptNull)

    //#lesson_4 (inputs)
    println("Enter Your Name :")
    //** to read line from user
    var readName: String = readLine()!! //** " !! " mean this var not accept null, and it must have value

      println("Enter Your Age :")
      var  readAge:Int = readLine()!!.toInt() //** readLine() return string so if you expect int only convert it to in ".toInt()"

      println("Enter Your Salary :")
      var readSalary:Double = readLine()!!.toDouble()

      print ("The name is : " + readName +"\n" + "The age is : " + readAge +"\n" + "The Salary is : " + readSalary)

    //#lesson_5 (Convert data Type)
    //** convert between any data type in the same way
      var intData : Int = 1234
      var strData : String = intData.toString() //** you cant simply write this "var strData : String = intData" you have to conver it to string using "toString()"
      var floatData : Float = 2.5f
      var doubleData : Double = floatData.toDouble()
      var doubleVar = 2.5
      var intDataa : Int = doubleVar.toInt()
       print(intDataa) //** will print 2

    //#lesson_6 (Math operations)
    //** normal sum operation
    var num1 : Double = 12.6
    var num2 : Double = 5.2
    var addnums = num1 +  num2 //** use * if you want to multiplay nums and - and / and so on ..
    println ("Sum = " + addnums)
    println ("Sum = $addnums") //** will give the same result of println ("Sum = " + sum)

    println ("--------Calculator---------")
    println ("Enter First number")
    var readNum1 : Double = readLine()!!.toDouble()
    println ("Enter Second number")
    var readNum2 : Double = readLine()!!.toDouble()
    var sum = readNum1 + readNum2
    var substract = readNum1 - readNum2
    var multiplaction = readNum1 * readNum2
    var divition = readNum1 / readNum2
    print("The sum = $sum , The sub = $substract , The multiplay = $multiplaction , The divide = $divition")



}
