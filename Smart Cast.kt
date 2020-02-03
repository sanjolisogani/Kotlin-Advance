//Smart cast is a feature in which Kotlin compiler tracks conditions inside if expression. If compiler founds a variable is not null of
// type nullable then the compiler will allow to access the variable.
//Use of is for smart cast
/*While using is or !is for checking the variable, the compiler
tracks this information and internally cast the variable to target
type.This is done inside the scope if is or !is returns true.*/

fun main(args: Array<String>){
    val obj: Any = "The variable obj is automatically cast to a String in this scope"
    if(obj is String) {
        // No Explicit Casting needed.
        println("String length is ${obj.length}")
    }
    notis()
}


//Use of !is for smart cast
fun notis(){
    val obj: Any? = null
    if(obj !is String) {
        println("obj is not string")

    } else
    // No Explicit Casting needed.
        println("String length is ${obj.length}")
}