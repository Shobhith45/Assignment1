import java.time.Duration
import java.time.LocalTime
import kotlin.collections.sortedBy as sortedBy
import my.demo.Student



interface Human {
    fun think()
}
open class Complex(var real:Double,var img:Double){
    open fun add(){
        println(real+img)
    }
    companion object{
        var i:Int=0;
    }
    init{
        i++;
    }
}
enum class Gender(var value:String):Human{
    MALE("Male"){
        override fun display() {
            println("Male value")
        }

        override fun think() {
            println("thinking")
        }
    },
    FEMALE("Female"){
        override fun display() {
           println("Female value")
        }


    };
    abstract fun display()
    override fun think() {

    }

}

fun main(args:Array<String>) {
    Student("shobhith").printMessage()
    val start = LocalTime.now()
    val end = LocalTime.of(20, 30, 55)
    val duration: Duration = Duration.between(start, end)
    val totalSecs=duration.seconds
    val hours = totalSecs / 3600;
    val minutes = (totalSecs % 3600) / 60;
    val seconds = totalSecs % 60;
    println(hours)
    println(minutes)
    println(duration.seconds/3600)
    println(Gender.MALE.think())
    object : Complex(2.0,5.0){
        override fun add() {
            super.add()
        }
    }.add()
    addComplex.add()
    Complex(1.0,2.0)
    Complex(1.0,5.0)
    println(Complex.i)



}

object addComplex:Complex(5.0,5.0){
    override fun add() {
        super.add()
    }
}