import scala.collection.mutable._

package object PizzaBuilder {
  class PizzaMaker {
    def Pizza(item : String) = new Pizza
  }

  class Pizza {
    var layer : ListBuffer[Any] = ListBuffer()

    def spread(item : String) = {
      layer += item
      this
    }

    def toppings(item : String*) = {
      layer += item
      this
    }

    def bake = this
    override def toString = layer.mkString(", ").replaceAll("WrappedArray", "")
  }

  val as = "as"
  val cheese = "cheese"
  val sausage = "sausage"
  val mushroom = "mushroom"
  val sauce = "sauce"

  def create = new PizzaMaker
}