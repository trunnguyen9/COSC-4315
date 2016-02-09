
def static create(name) {
    return name
}

def static Pizza (Closure closure) {
    Pizza pizza = new Pizza()
    pizza.with(closure)
    return pizza
}

class Pizza {
    def layer = []

    def propertyMissing(String name) { name }

    def toppings(String[] name) {
        layer << name
    }

    def spread(String name) {
        layer << name
    }

    def String toString() {
        return layer.toString()
    }

}


