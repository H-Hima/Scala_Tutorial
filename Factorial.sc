import scala.annotation.tailrec

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

def square(x:Int) = x*x

var (a,b)=(2+5,9)
println(a)
println(b)

println(sum(x=>x*x,1,10))
println(sum(square,1,10))