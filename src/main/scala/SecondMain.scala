object SecondMain extends App {
  println("Salaam")
  SampleClass.SampleClassFactory(10)
  println(SampleClass("100").+(120)*2)
  println(SampleClass("100")+120*2)
  println(SampleClass("100").sum(120, 200))
  println(SampleClass("100") sum (120, 200))

}
