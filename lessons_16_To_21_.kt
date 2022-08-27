fun main(args: Array<String>){

//#lesson_16 (Loop Control)
    for(counter in 1..10) { //** will print the counter number from 1 to 5 only
        println("Counter : $counter")
        if (counter == 5){
            break //** To exit loop when counter equal number 5 "will exit immediatly at this line if we have another codes below will not execute"
            //** used for example if I am searching number in array, so if I found a number why should I keep the loop work ? I have to exit the loop
        }
    }

    for (count in 1..5){ //** This will print the count number except number 3
       if(count == 3){
           continue //** This mean when count equal 3 exit loop in this case only and continue execuation noramly with other cases. Same as break the codes below continue will not execute in that case
        }
        println ("Counter number : $count")
      }

    loop@ for (i in 1..5){//** If we want to exit both loop outer and inner we use Label you can name it as you want here we name it loop
        //** if you simply use break in inner loop this will exit the inner in that case only, and outer will work and will execute the inner loop again in the next case (will work like continue)
        println("The outer loop : $i")
        for(ii in 1..3) {
            if(i == 3){
               break@loop
          }
            println("The inner loop : $ii")
        }
    }

//#lesson_17 (Strings)
    var msg = " Welcome to Kotlin" //** The string does not store in the memory as block its store letter by letter in consecutive locations
    println("msq at location 5 : " + msg[5])//** this will print the letter at index 5 "the index start from 0"
    for(index in 0..msg.length - 1){ //** msg.length will return the actual length of string (its not like index which is start at 0) , its count number of letters start from 1
        print("msg[$index] = " + msg[index] + ",")
    }
    var name = " Sarah Salameh "
    println("\n" + name.uppercase()) //** convert all name letters to upper case
    println(name.lowercase()) //** convert all name letters to lower case
    println(name.trim()) //** remove space at the begging and end of name
    println(name.split(" ")) //** split(" ")) mean every time you face space make a split and save the all result from that in an array. "(" ")" this mean split depend on white space, if we want to split depend on comma for example we write .split(",")

//#lesson_18 (Array)
    var arrayInt = Array<Int>(5){0} //** define array of Int data type size 5 and all values in array equal to 0
    arrayInt[1] = 1 //** set value 1 in the second location in arrayInt
    for(index in 0..arrayInt.size-1){//** print array values "way 1"
        println("The array values : "+ arrayInt[index])
    }

    for(index in 0..arrayInt.size-1) {//** to set the array value from screen
   //** to read the array values from user you have to use this way 1 (this way) in for loop not the way 2 which is (item in arrayInt)
        println("Enter [$index] value : ")
        arrayInt[index] = readLine()!!.toInt()
    }

      for(item in arrayInt){//**print array values "way 2" "item is variable you can use any name"
      println("The array values : " + item)
      }

    //#lesson_19 (ArrayList)
    //** ArrayList is quite similar to array, but without size
      var arrayList = ArrayList<String>()
      arrayList.add("Sarah") //** to add element to arrayList "not by index as in array"
      arrayList.add("Laya")
      arrayList[1] = "Layan" //** to update value at index 1 "the index start from 0"
      arrayList.set(0,"Sarah Salameh") //** another way to update value

     for(item in arrayList){ //** print arrayList values "way 2"
       println(item)
     }

      for(index in 0..arrayList.size - 1){ //** print arrayList values "way 1"
        println(arrayList[index])
     }

    //** To search name in arrayList
    println("Enter name to search it :")
    var readName:String = readLine()!!.toString()
    if(arrayList.contains(readName)){ //** readName have to be identical to the value we are looking for in arrayList otherwise it will return not founded
        println("Name Found :) ")
    }
    else {
        println("Name Not Found :( ")
    }

    //#lesson_20 (HashMap)
    //** HashMap used to store data in form key and value
      var map = HashMap<Int , String>() //** define HashMap and set the type of key = Int and the type of value = String
      map.put(100, "Sara") //** to add value to map
      map.put(200, "Laya")
      map.put(300, "Rowida")
    //** in HashMap if we want to add new elemnt it must have unique key, but if we use the key we already use it this will update that element not creating new one
      map.put(100,"Sarah Salameh") //** to Update value just use the same kay of element you want to update and .put func will update it "it will not create a new element just update"
    //** The data in HashMap stored using key not index, so if you want to retrive element you have to call it by its key
      println(map[100]) //** this line and below do same thing
      println(map.get(100))

    //** to print HashMap elemets
      for (myKeys in map.keys){ //** map.keys will return all map keys and then store it in myKeys variable
        println("The value at key $myKeys is = " + map[myKeys])
     }

    //#lesson_21 (Function)
    //** we use Function to write Once block of code that expected to be use frequently, and we can use this block Many times
    show(10) //** To call function show and pass to it 10
    var callFuncToSum = sumNum(10.0 , 12.0)
    println(callFuncToSum) //** If I expect from the function to return value I have to put it in variable to save the returned value
}


fun show(number:Int){ //** define the name of function here"show" and the paramter and its data type here"number:Int" and what type of data return from function here no return data so don't write anything
    println("Number is : $number") }

fun sumNum(num1:Double, num2:Double): Double { //** : Double is return type
   var sum = num1 + num2
    return sum
}