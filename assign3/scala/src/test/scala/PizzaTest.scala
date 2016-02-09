import collection.mutable._
import org.junit.Test
import org.junit.Assert._
import PizzaBuilder._

class PizzaTest {
  @Test
  def testEmptyPizza() = {
    var pizza = (create Pizza as
                    bake)

    assertTrue(pizza.isInstanceOf[Pizza])
  }

  @Test
  def testPizzayWithCheese() = {
    var pizza = (create Pizza as
                    spread cheese
                    bake)
    var expectedLayer = "cheese"
    assertEquals(expectedLayer, pizza.toString)
  }

  @Test
  def testPizzaWithTopping() = {
    var pizza = (create Pizza as
      spread cheese
      toppings (sausage, mushroom)
      bake)
    var expectedLayer = "cheese, (sausage, mushroom)"
    assertEquals(expectedLayer, pizza.toString)
  }

  @Test
  def testPizzaWithSpreadAndTopping() = {
    var pizza = (create Pizza as
      spread cheese
      toppings (sausage, mushroom)
      spread sauce
      bake)
    var expectedLayer = "cheese, (sausage, mushroom), sauce"
    assertEquals(expectedLayer, pizza.toString)
  }
}
