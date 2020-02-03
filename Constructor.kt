//Constructor is a block of code which gets executed when a object of
//class is created
fun main(args:Array<String>) {
var obj = Boxer("Abc",2000,700)
}

class Boxer(name:String,power:Int,speed:Int){
    private var name : String =""
    private var power : Int? = null
    private var speed : Int=0
    //init block is executed whenever a object is initialized or created
   init {
       this.name=name  //this refers to object of type car class
        this.power=power
        this.speed=speed
       println(name+"-"+power+"-"+speed)
   }
}