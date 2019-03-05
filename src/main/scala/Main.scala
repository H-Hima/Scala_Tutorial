import java.io.File
import java.nio.file.{Files, Paths, StandardCopyOption}

import scala.annotation.tailrec
import scala.collection.mutable
import scala.collection.mutable.ListBuffer
import scala.util.Random

object Main extends App{

  try {
    val aa: File = new File("D:/a.txt")
    println(Files.copy(Paths.get(aa.getAbsolutePath), Paths.get(aa.getAbsolutePath+"_temp"),StandardCopyOption.REPLACE_EXISTING))
    Random.nextInt(10000)<10
  }
  catch {
    case _:Throwable =>
  }

  assert(false)

  var Z=(x:Int,y:Int)=>x+y
  print(Z(2,3))

  Z=(x:Int,y:Int)=>x-y
  print(Z(2,3))

  def sumRecursion(start:Int,end:Int):Int = {
    def loop(start: Int):Int= {
      if (start > end)
        0
      else
        start + loop(start + 1)
    }
    loop(start)
  }

  def sumTailRecursion(start:Int,end:Int):Int = {
    @tailrec
    def sumAcc(start:Int,accumulator:Int): Int = {
      if(start>end)
        accumulator
      else
        sumAcc(start+1,accumulator*start)
    }
    sumAcc(start,1)
  }

  def sum(func:Int=>Double,start:Int,end:Int):Double = {
    def accumulatedSum(start:Int,accumulator:Double):Double = {
      if (start > end)
        accumulator
      else
        accumulatedSum(start + 1, accumulator + func(start))
    }
    accumulatedSum(start,0)
  }

  def definedFunc(x:Int)=x*x

  println(sum(x=>x,0,10))

  println(sum(x=>x,0,10))
  println(sum(definedFunc,0,10))


  def sumCurrying(func:Int=>Double):((Double,Double)=>Double,Double)=>(Int,Int)=>Double = {
    def resultFunction(combine:(Double,Double)=>Double,zero:Double)(start:Int,end:Int) =
    {
      def accumulatedSum(start: Int, accumulator: Double): Double = {
        if (start > end)
          accumulator
        else
          accumulatedSum(start + 1, accumulator + func(start))
      }
      accumulatedSum(start,0.0)
    }
    resultFunction
  }

  def sumCurrying2(func:Int=>Double)(start:Int,end:Int):Double = {
    def accumulatedSum(start: Int, accumulator: Double): Double = {
      if (start > end)
        accumulator
      else
        accumulatedSum(start + 1, accumulator + func(start))
    }
    accumulatedSum(start,0.0)
  }

  def sumSquare2=sumCurrying2(x=>x*x)(_,_)
  def sumSquare=sumCurrying(x=>x*x)
  sumSquare2(1,10)

  sumCurrying2(x=>x)(1,10)

  def A=sumCurrying(x=>x)
  //println(A(0,10))

  def B=sumCurrying2(x=>x)(_,_)
  println(B(0,10))

  def add(rational1: Rational,rationa2: Rational)= {
    rational1.add(rationa2)
  }

  println(new Rational(1,2).+(new Rational(2,3)))
  println(new Rational(1,2) + new Rational(2,3))

  assert(true,"message")

  println(-new Rational(2,3))

  val f=new Rational(10,9)
  Rational.add2()

  val list=ListBuffer("11")
  val test=new Rational(9,8,list)

  println(test)

  list.append("someValues")

  println(test)

  println(f.less(f))

  val a=5
  assert(a<10,"message")

  def myFunc(x: String) = {
    if(false)
      x
  }

  myFunc("dsfsdfsdf"+"sfsdfdsf"+"sadsdadsd")

}

object Rational {
  val singleton=new Rational(10)
  def add2(): Unit = {

  }
}

class Rational(x:Int,y:Int,z:mutable.ListBuffer[String]=ListBuffer[String]()) {
  def this(x:Int) = this(x,1)

  require(y!=0,"Assert Message")

  def up=x
  def down=y

  val a=10

  def list=z

  def add(rational: Rational) = {
    new Rational(up*rational.down+down*rational.up,down*rational.down)
  }

  override def toString: String = {
    up+"/"+down+":"+z.mkString("<=>")
  }

  def less (rational: Rational) = true

  def + (rational: Rational) = add(rational)

  def unary_- = new Rational(-up,down)

}
