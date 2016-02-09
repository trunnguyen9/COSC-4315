object RodCutter {

  def getBestSolution(size : Int, prices : Map[Int, Int]): (Int, List[List[Int]]) = size match{
    case 0 => (0, List(List()))

    case _ => {
      val initialSolution = (pickPrice(size, prices), List(List(size)))

      (1 to size - 1).foldLeft(initialSolution){
        (result, e) => findBestSolution(result, getBestSolutionsForSplit( e , size, prices))
      }
    }
  }

  def getBestSolutionsForSplit(split: Int, size: Int, prices: Map[Int, Int]): (Int, List[List[Int]]) = {
    val firstList = getBestSolution(split, prices)
    val secondList = getBestSolution(size - split, prices)
    val combinedPrice = firstList._1 + secondList._1
    val combinedList = (for(firstCut <- firstList._2; secondCut <- secondList._2) yield (firstCut ::: secondCut).sorted).distinct
    
    (combinedPrice, combinedList)
  }

  def findBestSolution(firstSolution: (Int, List[List[Int]]), secondSolution: (Int, List[List[Int]])) : (Int, List[List[Int]]) = (firstSolution._1 compare secondSolution._1).signum match  {
    case  1 => firstSolution
    case -1 => secondSolution
    case  0 => {
      val mergedList = (firstSolution._2 ::: secondSolution._2)

      (firstSolution._1, mergedList)
    }
  }

  def pickPrice(size : Int, prices : Map[Int, Int]) = {
    if(prices.contains(size)) prices(size) else 0
  }
}
