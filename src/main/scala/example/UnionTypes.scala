package example

object UnionTypes {
  case class Success(a: Double)
  case class Failure(msg: String)
  type Result = Success | Failure
  def divide(a: Double, b: Double): Result =
    if(b == 0) Failure("it can't divide zero")
    else Success(a / b)
  
  def run: Unit = {
    println("[UnionTypes]")
    println("Success : " + divide(10, 2) )
    println("Failure : " + divide(10, 0) )
  }
}