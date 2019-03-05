import scala.collection.mutable

object First {
  def function2(a: => String):String = {
    val b: String = a
    b
    b
    b
    "Hello"
  }

  def function2ByName(a: => String):String = {
    val b: String = a
    b
    b
    b
    "Hello"
  }

  def function3(a:String="zy", b:String="abdc") = {
    println(a)
  }

  def function4(a: String) = {
    println(a)
    a
  }

  def function(a:Int, b:String): Int = {
    val string: String =b+b

    if(b.equals("Salaam")) {
      string.length+a
    }
    else if(b.startsWith("B")) {
      b.length+a
    }
    else
      10
  }

  def function5(func: String => String) = {

  }

  def main(args: Array[String]): Unit = {
    val a:Int = 10
    var b:Int = 10
    def c:Int = 10

    println("Hi")
    println(function(9,"Dorood"))
    println(function2("Salaam"))

    function3(b="Salaam")

    {

    }

    println(function2("Salaam"+" "+"Class"))

    println("====================")

    def function12():String = {
      "aaaa"
    }

    println(function2(function12))

    println(function2ByName(function4("Inam Akharish")))
  }
}
