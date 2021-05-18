fun main() {


    var tipa = Truck("usy667v", 189.09, "600kg")
    tipa.load(45)
    tipa.unload(20)
   println( tipa.weightCheck("1200kgs"))
   println( tipa.weightCheck("300kgs"))

}


class Truck(var registration:String,var totalWeight:Double,var capacity:String){
    fun load(weight:Int){
        var newWeight=totalWeight+weight
        println(newWeight)
    }
    fun unload(weight: Int){
        var reduce=totalWeight-weight
        println(reduce)
    }
    fun weightCheck(kg:String):String {

        if (kg > "capacity") {
            return ("Truck is overloaded by $capacity")

        } else {
            return("Truck is underloaded by $capacity")
        }
    }
 }
