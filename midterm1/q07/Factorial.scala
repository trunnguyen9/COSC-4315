import scala.annotation.tailrec

class Factorial {
  def factorialRegularRecursion(number : Int) : Int = number match {
    case 0 => 1
    case _ =>
       factorialRegularRecursion(number - 1) * number
  }
  
  @tailrec final def factorialTailRecursion(number : Int, result : Int = 1) : Int = number match {
    case 0 => 1
    case 1 => result
    case _ =>
       factorialTailRecursion(number - 1, result * number)
  }
  
  def factorial(number : Int) : Int = number match {
    case 0 => 1
    case _ =>
        Range(1, number + 1).product
  }
}