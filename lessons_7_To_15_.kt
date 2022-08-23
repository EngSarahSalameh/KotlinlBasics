import java.util.*

fun main(args: Array<String>){

    //#lesson_7 (math priorites)
    /*Operation priorites
    1- ()
    2- ^
    3- * , /
    4- + , -
    5- =
     */
    //** The operation with high priority execute first
    //** If you have two operation with same priority will execute from "left" to "right"
    //** If you want lower priority to execute first put it inside parentheses
    val num1 = 10
    val num2 = 20
    val num3 = 5
    var sum: Int = num1 + num2 * num3 - 3
     print("Sum = $sum") //** the result will be 107

    //#lesson_8 (Program find my age)
    //** input
      println("Enter your Birth Year")
      var yearOfBirth : Int = readLine()!!.toInt()
      println("Enter your Birth Month")
      var monthOfBirth : Int = readLine()!!.toInt()
      println("Enter your Birth Day")
      var dayOfBirth : Int = readLine()!!.toInt()
    //** process
      var currentYear = Calendar.getInstance().get(Calendar.YEAR); //** this function return a year that in your calnder in your device and we can use .get(Calendar.MONTH); to get month and same with day and hour ...
      var currentMonth = Calendar.getInstance().get(Calendar.MONTH) + 1 //** don't have to write + 1 , but I faced a problem the function return the last month not current month
      var currentDay = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
      var year =  currentYear - yearOfBirth
      var month = currentMonth - monthOfBirth
      var day = currentDay - dayOfBirth
    //** output
       println("Your Age Is $year Years , and $month Months , and $day Days")

    //#lesson_9 (Logic operations)
    //** In And gate the result will be true if both condition true
    println (10 > 11 && 11 < 10) //** false "and" false will return false
    println (3>10 && 10 > 2) //** false "and" true will return false
    println(10 > 3 && 10 > 3) //** true "and" true will return true
    //** to check if variable in the range (1 , 100) using And gate
    var number = 10
    println(number >= 1 && number <= 100) //**true and true return true
    number = 101
    println(number >= 1 && number <= 100) //**true and false return false mean its not in range

    //** In Or gate if both condition false it become false otherwise will be true
    println(3>10 || 5 > 2) //** false and true return true

    //** In not gate if the value true will return false and if its  false will return true
    var isMarried = true
    print(!isMarried) //** will return false

   //#lesson_10 (Simple IF)
      println ("Enter Number : ")
      var readNmuber : Int = readLine()!!.toInt()
      if(readNmuber >= 1 && readNmuber <= 100){ //** if the condtion in () true excute code inside {}
       println ("The number in range (1 ,100)")
    }

    //#lesson_11 (IF Else)
    //** you can use if else block inside other if else block as you want
    println ("Enter Your Grade : ")
    var grade : Int = readLine()!!.toInt()
    if (grade >= 50 ) {
        println("You Pass")
        }
   else {//** if the "if" code block excuted the else will not excute "if the condtion true (the if {} will excute) otherwise (the else {} will excute)"
        println("You Failed")
        }

    //#lesson_12 (IF Else)
    //** In "else if" we determine another condition
      println ("Enter Your Grade : ")
      val readGrade : Int = readLine()!!.toInt()
      if (readGrade >= 90 ){
         println ("A")
     }
      else if (readGrade >= 80 && readGrade < 90){
          println ("B")
      }
      }
    else if (readGrade >= 70 && readGrade < 80){
        println ("C")
      }
    else {
         println ("fail")
     }

   //#lesson_13 (when)
    println("Enter Number : ")
   val readNum : Int = readLine()!!.toInt()
    //** Use "when" keyword to create such a menu to test readNum
    when (readNum) {
       1->{ //** if the readNum equal to 1 do something here {}
            println("You Entered 1")
        }
        2->{//** if the readNum equal to 2 do something here {}
            println("You Entered 2")
        }
        3,4 ->{//** if the readNum equal to 3 OR 4 do something here {}
            println("You Entered  3 OR 4")
        }
        in 10..30 ->{//** if the readNum between 10 and 30 do something here {}
            println("You Entered  number between 10 and 30")
        }

        !in 10..30 ->{//** if the readNum NOT between 10 and 30 do something here {}
            println("You Entered  number NOT between 10 and 30")
        }

        else -> { //** if all condition false will execute the else statment
            println("Out of range")
        }
    }

    //#lesson_14 (For loop)
    for (item in 1..5){ //** "item" just a variable name you can use any name , "in" to specify the range , "1..5 to repeat it 5 times"
        if (item % 2 == 0) {
     println("Hello Sarah! This will print if the item have even value") }
     println("To see item value : $item")
    }
    //** you can use loop inside loop
    for (hash in 1..5){
       println("######")
       for(star in 1..3){//** every time the outer loop excuted once the inner loop excute all its cycle (Here in this example when outer excute the inner excute 3 times)
         println(" * * *")
        }
    }

    //#lesson_15 (While Do While)
    //** In "while" loop you have to initliaze the counter first and it must be var
    var count = 1
    while (count < 5){ //** to repeat it 4 times
        println("We use while loop to print this line four times")
        count++ //** Update the counter
    }
  //** the difference between while and do while that (while will not execute the code if the condition false because it check the condtion first on they other hand do while execute the code first then check the condition)
    //** here same while code using do while and false condtion
    count = 6
    do {
        println("We use DO while loop to print this line") //** this will executed once
    }
    while(count < 5)


}