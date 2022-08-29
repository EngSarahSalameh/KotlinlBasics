//#lesson_31 (Threads)
//** Threads mean executing more than operation in the same time

class myThread : Thread { //** To implement thread you have to inherit class Thread, and add its constructor "just write () near Thread, like this Thread() "
    //** Class Thread has function called "run" put your code inside it"The codes you want to be executed simultaneously"
    //** we have to override it to write our code inside it, to make our code executed in threads in same time

    var processName: String? = null

    //** you maybe have more than thread, and you want to track it, so we can pass the thread name to constructor
    constructor (processName: String) : super() { //** constructor () : super() , this line mean initialize the constructor of my class and constructor of Thread class as well
        this.processName = processName
    }

    override fun run() {
        var counter = 0
        while (counter < 5) { //** the loop will execute very fast, and we can make it sleep for a period
            println("The Thread [${this.processName}] Is Work , The Counter Now Equal = $counter")
            try {
                Thread.sleep(1000) //** 1000 miles second = 1 second
            } catch (ex: Exception) {
                println("The Error In Thread.sleep IS : ${ex.message}")
            }
            counter++
        }
    }
}


fun main() {
    //** You can't know which thread will execute first and which one will execute second etc.
    //** evey time you run the program they will execute in different order

    var t1 = myThread("Thead 1") //** To create instance from myThread class

    t1.start() //** to make thread start " you can start more than one thread and all of them will work in the same time "
    //** don't write this t1.run() to call the thread because you will call it as a function not thread to call it as thread you have to use .start

    var t2 = myThread("Thead 2")
    t2.start()

    var t3 = myThread("Thead 3")
    t3.start()
    t3.join()  //** To make some code wait until another complete its execution
    //** println will not be executed until t3.start() finish its execution, so println will appear at bottom
    println("Threads working simultaneously")

}
