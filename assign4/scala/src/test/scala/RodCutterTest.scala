import org.junit.Test
import org.junit.Assert._
import org.junit.Before

class RodCutterTest {
  val prices = Map(1 -> 1, 2 -> 2, 3 -> 3, 4 -> 4)
  val pricesMissingLengths = Map(1 -> 1, 3 ->3, 5 -> 4)

  @Test
  def testSize0() = {
    val exected = (0, List(List()))
    compareTwoSolutionLists(exected,  RodCutter.getBestSolution(0, prices))
  }

  @Test
  def testSize1() = {
    val exected = (1, List(List(1)))
    compareTwoSolutionLists(exected, RodCutter.getBestSolution(1, prices))
  }

  @Test
  def testSize2() = {
    val exected = (2, List(List(1, 1), List(2)))
    compareTwoSolutionLists(exected, RodCutter.getBestSolution(2, prices))
  }

  @Test
  def testSize3() = {
    val exected = (3, List(List(1, 1, 1), List(1, 2), List(3)))
    compareTwoSolutionLists(exected, RodCutter.getBestSolution(3, prices))
  }

  @Test
  def testSize4() = {
    val exected = (4, List(List(1, 1, 1, 1), List(1, 1, 2), List(1, 3), List(2, 2), List(4)))
    compareTwoSolutionLists(exected, RodCutter.getBestSolution(4, prices))
  }

  @Test
  def testPriceListMissingLengths() = {
    val exected = (5, List(List(1, 1, 1, 1, 1), List(1, 1, 3)))
    compareTwoSolutionLists(exected, RodCutter.getBestSolution(5, pricesMissingLengths))
  }

  @Test
  def testSolutionNotIncludeLengthItself() = {
    val exected = (5, List(List(1, 1, 1, 1, 1), List(1, 2, 2), List(1, 1, 3), List(1, 1, 1, 2), List(1, 4), List(2, 3)))
    compareTwoSolutionLists(exected, RodCutter.getBestSolution(5, prices))
  }

  def compareTwoSolutionLists(solution1 : (Int, List[List[Int]]), solution2 : (Int, List[List[Int]])) = {
    assertEquals(solution1._1, solution2._1)
    assertEquals(solution1._2.toSet, solution2._2.toSet)
  }
}