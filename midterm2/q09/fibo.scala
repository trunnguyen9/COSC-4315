import scala.annotation.tailrec

object Fibonacci {
    def main(args: Array[String]) = {
        println(fibonacci(400))
    }

    def fibonacci(position : Int) : BigInt = position match{
        case 0 => BigInt(1)
        case 1 => BigInt(1)
        case _ => {
            fibonacciHelper(2, position, List(1, 1))
        }
    }

    @tailrec final def fibonacciHelper(position : Int, upperLimit : Int, lookUpTable : List[BigInt]) : BigInt = {
        if(position < upperLimit) {
            val currentValue = lookUpTable.apply(position - 2) + lookUpTable.apply(position - 1)
            fibonacciHelper(position + 1, upperLimit, lookUpTable :+ currentValue)
        }else {
            lookUpTable.apply(position - 2) + lookUpTable.apply(position - 1)
        }
    }
}