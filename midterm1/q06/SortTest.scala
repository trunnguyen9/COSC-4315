import org.junit.Test
import org.junit.Assert._

class SortTest {
  @Test
  def testSort4() = {
    var sort = new SortRecursive()

    assertEquals(List(1, 2, 3, 4), sort.getSortRecursive(List(4, 3, 1, 2)))
  }

  @Test
  def testSortEmpty() = {
    var sort = new SortRecursive()

    assertEquals(List(), sort.getSortRecursive(List()))
  }

  @Test
  def testSort1() = {
    var sort = new SortRecursive()

    assertEquals(List(1), sort.getSortRecursive(List(1)))
  }

  @Test
  def testSort3() = {
    var sort = new SortRecursive()

    assertEquals(List(1, 2, 3), sort.getSortRecursive(List(3, 2, 1)))
  }

  @Test
  def testSortTail4() = {
    var sort = new SortTailRecursive()

    assertEquals(List(1, 2, 3, 4), sort.getSortTailRecursive(List(4, 3, 1, 2)))
  }

  @Test
  def testSortTailEmpty() = {
    var sort = new SortTailRecursive()

    assertEquals(List(), sort.getSortTailRecursive(List()))
  }

  @Test
  def testSortTail1() = {
    var sort = new SortTailRecursive()

    assertEquals(List(1), sort.getSortTailRecursive(List(1)))
  }

  @Test
  def testSortTail3() = {
    var sort = new SortTailRecursive()

    assertEquals(List(1, 2, 3), sort.getSortTailRecursive(List(3, 2, 1)))
  }
}