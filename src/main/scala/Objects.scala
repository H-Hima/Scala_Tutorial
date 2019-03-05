class Objects(_value:Int, _name:String) {
  private val value:Int = _value
  protected val name = _name
  private def getName = name

  def this(b:String) = {
    this(0, b)
  }

  override def toString: String = {
    "("+value+","+_name+")"
  }
}
