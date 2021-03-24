fun main(){
var sum=23+3.5f
    println(sum)
    var num1=486
    var num2=34
    var modulus=486%34
    println(modulus)
    var name="Mary Owuor"
    var values="respect ,discipline"
    var identify="My name is $name and these are my values $values"
    println(identify)
}
fun sum(num1:Int,num2:Float):Float{
    var sum=num1+num2
    return sum
    println (sum)
}
// adding float to an integer
fun modulus(num1: Int,num2:Int):Int{
    var modulus=num1%num2
    return modulus
    println(modulus)
}// looking for remainder .
fun identify(name:String,values:String){
    var identify="My name is $name ,and I value $values ."
    println(identify)
}