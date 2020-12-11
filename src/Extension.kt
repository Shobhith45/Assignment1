class Student(var name:String,
              var age:Int,
              var usn:String){
    var enroll:String="";

    fun printStudnet():String{
        return "Name:$name , Age: $age ,USN:$usn"
    }
}
fun main(){
    val shobhith:Student=Student("shobhith",23,"4kv16cs069")
    println(shobhith.printStudnet())
    fun Student.enrollCourse(){
        enroll="Java,Python,C"

        println("Courses opted $enroll with marks $marks")

    }
    shobhith.enrollCourse()
    println("marks obtained:${shobhith.marks}")
    println(shobhith.marks)

}
val Student.marks:Int get() = 50

