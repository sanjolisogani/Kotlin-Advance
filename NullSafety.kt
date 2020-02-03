/*null safety is a procedure to eliminate the risk of null
reference from the code. Kotlin compiler throws NullPointerException
immediately if it found any null argument is passed without
executing any other statements.
 */
/*Kotlin Nullable Types and Non-Nullable Types
references which can hold null (nullable reference) and which
cannot hold null (non null reference). Normally,types of String
are not nullable.To make string which holds null value, we have to
explicitly define them by putting a ? behind the String as: String? */

///Checking for null in conditions
fun main(args: Array<String>){
    var str: String? = "Hello" // variable is declared as nullable
    var len = if(str!=null) str.length else -1
    println("str is : $str")
    println("str length is : $len")

    str = null
    println("str is : $str")
    len = if(str!=null) str.length else -1
    println("b length is : $len")
}