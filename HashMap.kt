// Kotlin HashMap class implements the MutableMap interface
// using Hash table.
// It store the data in the form of key and value pair.


fun main(args: Array<String>){

    val hashMap:HashMap<Int,String> = HashMap<Int,String>() //define empty hashmap
    hashMap.put(1,"Ajay")
    hashMap.put(3,"Vijay")
    hashMap.put(4,"Praveen")
    hashMap.put(2,"Paras")
    println(".....traversing hashmap.......")
    for(key in hashMap.keys){
        println("Element at key $key = ${hashMap[key]}")
    }}
