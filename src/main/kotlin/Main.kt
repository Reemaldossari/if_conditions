import jdk.dynalink.Operation

fun main (){

//    Q1 :


    var number0ne :Int = 0
    var numbertwo :Int = 0
    var operation : Char = '+'

    println(" Please Enter The First Number :")

    number0ne = readLine()!!.toInt()

    println("Please Enter The Second Number :")

    numbertwo = readLine()!!.toInt()

    println("Please Enter The Operation like + ,- ,*, % :")

    operation = readLine()!!.single()



    when (operation){

        '+' -> Add(number0ne ,numbertwo)
        '-' -> sub(number0ne ,numbertwo)
        '*' -> mult(number0ne ,numbertwo)
        '%' -> per(number0ne ,numbertwo)

    }
}

 fun Add (num1 : Int , num2 : Int )  {

   println(" $num1 + $num2 = ${ num1 + num2}")

 }

fun sub (num1 : Int , num2 : Int){

    println(" $num1 - $num2 = ${num1 - num2}")


}

fun mult (num1 : Int , num2 : Int){

    println("$num1 * $num2 = ${num1 * num2}")

}

fun per (num1 : Int , num2 : Int) {

    println("$num1 % $num2 = ${num1 % num2}")


//Q2 :

    var salary: Double = 0.0
    var rate: Int = 0
    var newSalary : Double = 0.0

    println("please enter employee salary")
     salary = readLine()!!.toDouble()
    println("please enter employee rate from 1 to 3")
     rate = readLine()!!.toInt()
     newSalary = 1.0
    if (rate >= 1 && rate <= 3) {
        if (rate == 1) {
            newSalary = salary / 1000 * 3
            newSalary += salary
            println(newSalary)
        } else if (rate == 2) {
            newSalary = salary / 1000 * 9
            newSalary += salary
            println(newSalary)
        } else if (rate == 3) {
            newSalary = salary / 1000 * 1.5
            newSalary += salary
            println(newSalary)
        }
    } else {
        println("Please Enter Vaild Rate From 1 to 3")
    }

}