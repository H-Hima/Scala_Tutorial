import scala.annotation.tailrec
import scala.collection.mutable

object Second {

  def pow(number:Int,power:Int):Int = {
    def loop(power:Int): Int = {
      if(power == 0) {
        1
      }
      else {
        number*loop(power-1)
      }
    }
    loop(power)
  }

  @tailrec
  def gcd(number1:Int,number2:Int):Int = {
    if(number2 == 0) {
      number1
    }
    else {
      gcd(number2,number1%number2)
    }
  }

  def function(a:Any=90): Char = {
    "32342".reverse(0)
  }

  def main(args: Array[String]): Unit = {
    val array: Array[Any] = Array(10,20,"fdsf")
    val list: List[Int] = List(17,23)
    val set: Set[Int] = Set(10,20)
    val map: Map[Any, Any] = Map(
      "ali" -> 234,
      "hamid" -> 54,
      "fatemeh" -> 8775,
      345 -> "sfdsf"
    )

    array
    map
    set

    val array2 = array ++ array
    val set2 = set ++ (set+345)
    val map2 = map ++ (map+(765->984))
    val map3 = map ++ (map+Tuple2(765,984))

    println(array.mkString(","))
    println(array2.mkString(","))
    println((3445+:array).mkString(","))
    println((array:+3445).mkString(","))
    println((array:+"3445").mkString(","))
    println((array+:"3445").mkString(","))
    println(set)
    println(set2)
    println(map)
    println(map2)
    println(map3)

    println("==================")

    println(array(2))
    println(map("ali"))
    println(map.getOrElse("ali2",0))
    println(set.contains(343))

    println("==================")
    var i=0
    var sw=true

    while(i<array.length && sw) {
      println(array(i))
      i+=1
      sw=false
    }

    array.foreach(element => {
      println(element)
    })

    array.foreach(function)

    for (element <- array) {
      println(element)
    }

    map.foreach(pair => println(pair._1+"->"+pair._2))
    val _a=10

    (1 to 5).foreach(value => println(value))
    (1 until 5).foreach(value => println(value))

    val mutableArray = mutable.ArrayBuffer(90,70,20)
    mutableArray.append(37864)
    mutableArray.insert(0,37864)

    val mutableMap = mutable.Map(
      23->435,
      100->29,
      Tuple2(76,9)
    )

    mutableArray(1)=9

    mutableArray.toArray.toSet
    mutableMap.toMap

    val initial = (0 to 5)
    initial.foreach(record => println(record))
    val square = initial.map(record => record * record)
    square.foreach(record => println(record))

    val mapOnMap = map.map(record => (record._2, record._1))
    println(mapOnMap)

    val zip = array.indices.zip(array).toMap
    zip.foreach(println)

    println("============================")
    val flatMap = initial.flatMap(i => (0 to i))
    flatMap.foreach(println)

    println("============================")
    val arrayToFlat = Array(Array(2,3),Array(2, 2))
    arrayToFlat.flatMap(record => record).foreach(println)

    println((0 to 100).fold(0)((a,b) => a - b))
    println((0 to 100).reduce((a,b) => a + b))
  }
}
