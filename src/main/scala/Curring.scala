object Curring {
  def function1(a: Int):Int = {
    a*a
  }

  def function2(a: Int, func:(Int) => Int):Int = {
    func(a)*func(a)
  }

  def summarize(func:Int => Int)(a: Array[Int]): Int = {
    var result = 0
    a.foreach(element => result += func(element))
    result
  }

  def summarize2(func:Int => Int): (Array[Int]) => Int = {
    def innerFunction(a: Array[Int]) = {
      var result = 0
      a.foreach(element => result += func(element))
      result
    }
    innerFunction
  }

  def main(args: Array[String]): Unit = {
    println(function1(10))
    println(function2(10, (a:Int) => a-1))
    def array = (0 to 10).toArray
    def func = (a:Int) => a*a
    println(summarize(func)(array))

    def sumOfSquar = summarize(func)(_)
    def sumOfSquar2 = summarize2(func)
    println(sumOfSquar(array))
    println(sumOfSquar2(array))
  }
}
