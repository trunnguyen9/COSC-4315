import org.junit.Test
import org.junit.Assert._

class FibonnaciSeriesTest {
  var fibonacci = new FibonnaciSeries()
     
  @Test
  def testFibonnaciSeriesPosition0() = {
    var exepectedResult = List(1)
    assertEquals(exepectedResult, fibonacci. getSeriesRecursive(0))
  }
   
  @Test
  def testFibonnaciSeriesPosition1() = {
    var exepectedResult = List(1, 1)
    
    assertEquals(exepectedResult, fibonacci. getSeriesRecursive(1))
  }
  
  @Test
  def testFibonnaciSeriesPosition2() = {
    var exepectedResult = List(1, 1, 2)
    
    assertEquals(exepectedResult, fibonacci. getSeriesRecursive(2))
  }
  
  @Test
  def testFibonnaciSeriesPosition5() = {
    var exepectedResult = List(1, 1, 2, 3, 5)
    
    assertEquals(exepectedResult, fibonacci. getSeriesRecursive(4))
  }
 
  @Test
  def testFibonnaciSeriesTailRecursivePosition0() = {
    var exepectedResult = List(1)
        
    assertEquals(exepectedResult, fibonacci.getSeriesTailRecursive(number = 0))
  }
  
  @Test
  def testFibonnaciSeriesTailRecursivePosition1() = {
    var exepectedResult = List(1, 1)
        
    assertEquals(exepectedResult, fibonacci.getSeriesTailRecursive(number = 1))
  }
  
  @Test
  def testFibonnaciSeriesTailRecursivePosition2() = {
    var exepectedResult = List(1, 1, 2)
        
    assertEquals(exepectedResult, fibonacci.getSeriesTailRecursive(number = 2))
  }
  
  @Test
  def testFibonnaciSeriesTailRecursivePosition3() = {
    var exepectedResult = List(1, 1, 2, 3)
        
    assertEquals(exepectedResult, fibonacci.getSeriesTailRecursive(number = 3))
  }
  
  @Test
  def testFibonnaciSeriesTailRecursivePosition4() = {
    var exepectedResult = List(1, 1, 2, 3, 5)
        
    assertEquals(exepectedResult, fibonacci.getSeriesTailRecursive(number = 4))
  }
}
