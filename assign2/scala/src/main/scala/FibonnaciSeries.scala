import scala.annotation.tailrec

class FibonnaciSeries {
  def getSeriesRecursive(number: Int): List[Int] = number match {
    case 0 => List(1)
    case 1 => List(1, 1)
    case _ => {
        val result = getSeriesRecursive(number - 1)
        result :+ result.takeRight(2).sum
    }    
  }
  
  @tailrec final def getSeriesTailRecursive(number: Int, series: List[Int] = List(1, 1)): List[Int] = number match {
    case 0 => List(1)
    case 1 => series
    case _ => getSeriesTailRecursive(number - 1, series :+ series.takeRight(2).sum)
  }
}
