import org.junit.Test
import org.junit.Assert._

class FactorialTest {
  @Test
  def testRegular0() = {
    var fact = new Factorial
    assertEquals(fact.factorialRegularRecursion(0), 1)
  }
  
  @Test
  def testRegular1() = {
    var fact = new Factorial
    assertEquals(fact.factorialRegularRecursion(1), 1)
  }
  
  @Test
  def testRegular5() = {
    var fact = new Factorial
    assertEquals(fact.factorialRegularRecursion(5), 120)
  }
  
  @Test
  def testTail0() = {
    var fact = new Factorial
    assertEquals(fact.factorialTailRecursion(0), 1)
  }
  
  @Test
  def testTail1() = {
    var fact = new Factorial
    assertEquals(fact.factorialTailRecursion(1), 1)
  }
  
  @Test
  def testTail5() = {
    var fact = new Factorial
    assertEquals(fact.factorialTailRecursion(5), 120)
  }
  
  @Test
  def testNonRecursive0() = {
    var fact = new Factorial
    assertEquals(fact.factorial(0), 1)
  }
  
  @Test
  def testNonRecursive1() = {
    var fact = new Factorial
    assertEquals(fact.factorial(1), 1)
  }
  
  @Test
  def testNonRecursive5() = {
    var fact = new Factorial
    assertEquals(fact.factorial(5), 120)
  }
}