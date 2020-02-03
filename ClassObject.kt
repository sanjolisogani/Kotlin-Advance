//class is a blueprint for the object which have common properties
//object is the real time entity or logical entity
fun main(args: Array<String>){

    var obj = Car()  //object creation
    println(obj.speed)
    println(obj.power)

    obj.numberofwheels=4
    println(obj.numberofwheels)

    println(Car().numberofwheels) //object creation


}

class Car{
    //properties of class
    var speed:Int=200
    var power:Int=10
    var numberofwheels:Int=0
}