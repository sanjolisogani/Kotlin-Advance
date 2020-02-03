// secondary constructor can be created one or more in class.
// The secondary constructor is created using "constructor"
// keyword.
fun main(args:Array<String>){
    var obj=Animal(1000)
    var obj1=Animal("Lion","Yellow",4000,6000)
}

class Animal(power:Int){
    //By using primary as well secondary constructor in same class,
    // secondary constructor needs to authorize to primary
    // constructor. Authorization to another constructor in same
    // class is done using this() keyword
    init{
        println("Primary constructor : "+power)
    }
    constructor(name:String,color:String,speed:Int,power:Int) : this(power) {
        println(name+", "+color+", "+speed+", "+power)
    }
}