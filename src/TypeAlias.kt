typealias P= Pair<Int,Int>
typealias S= MutableMap<String,String>
interface Steering{
    fun left()
    fun right()
}
interface EngineType{
    val type:String
}
class Steer:Steering{
    override fun left() {
        println("left")
    }

    override fun right() {
        println("right")
    }
}
class Benz:Steering by Steer(),EngineType{

    override val type: String
        get() = "petrol"


}
class Altroz:Steering by Steer(),EngineType{

    override val type: String
        get() = "petrol"

}
fun main(){

    println(P(1,2))
    Benz().left()


}