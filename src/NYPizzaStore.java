public class NYPizzaStore extends PizzaStore {

    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredienteFactory ingredienteFactory = new NYPizzaIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredienteFactory);
            pizza.setName("New York Style Chesse Pizza");
        } else if (type.equals("clams")) {
            pizza = new ClamPizza(ingredienteFactory);
        } else
            return null;

        return pizza;
    }

}
