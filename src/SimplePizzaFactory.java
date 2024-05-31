public class SimplePizzaFactory {

    Pizza pizza = null;

    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return pizza = new CheesePizza();
        } else if (type.equals("onion")) {
            return pizza = new OnionPizza();
        }
        return null;
    }

}
