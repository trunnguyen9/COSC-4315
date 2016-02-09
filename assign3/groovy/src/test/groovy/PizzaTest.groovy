
import spock.lang.Specification
import static PizzaBuilder.create
import static PizzaBuilder.Pizza

class PizzaTest extends Specification {
    def "createNewPizzaTest"() {
        def pizza = create Pizza {}

        expect:
            pizza instanceof Pizza
    }
    
    def "createPizzaWithSpreadTest"() {
        def pizza = create Pizza {
            spread cheese
        }

        expect:
            "[cheese]" == pizza.toString()
    }

    def "createPizzaWithToppingTest"() {
        def pizza = create Pizza {
            toppings onions, sausage
        }

        expect:
        "[[onions, sausage]]" == pizza.toString()
    }

    def "createPizzaWithSpreadAndToppingTest"() {
        def pizza = create Pizza {
            spread cheese
            toppings onions, sausage
            spread sauce
        }

        expect:
        "[cheese, [onions, sausage], sauce]" == pizza.toString()
    }

}
