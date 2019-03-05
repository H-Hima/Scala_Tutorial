class SampleClass(value: Int) {
  val value2 = value * 2

  def +(other: Int) = {
    other + value
  }

  def sum(other: Int, other2: Int) = {
    other + value + other2
  }
}

object SampleClass {
  def apply(v: String): SampleClass = new SampleClass(v.toInt)

  def SampleClassFactory(v: Int): SampleClass = {
    new SampleClass(v)
  }
}