class Parent(v: Int) {
  val a=10
  def getName():String = {
    "NoName"
  }

  def getValue() = {
    a
  }
}

class Child(v: Int, n: String) extends Parent(v) with Comparator {

  val name = n

  override def getName():String = {
    name
  }

  override def equal(x: Any): Boolean = true
}

object ChildObject extends Child(100, "String") with Comparator {

}

trait Comparator {
  var b = 200

  def equal(x: Any): Boolean

  def notEqual(x: Any) = !equal(x)

  def sum(): Int = {
    b
  }
}

trait Comparator2 extends Comparator{

  def equal(x: Any): Boolean

  override def notEqual(x: Any) = !equal(x)
}
