package my.demo;
class Student(val name:String){
    var a:String=""
        get() = name
        set(value) {field=value}




    fun printMessage(){
        println("my name is $name")
    }
}

fun main(){
    println(Student("aa").a)
    var arr= arrayOf(1,2,3,4,5)

}

