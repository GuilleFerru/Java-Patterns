public class PizzaTestDrive {

    public static void main(String[] args) throws Exception {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        Pizza pizza;
        
        PizzaStore store = new PizzaStore(factory);
        pizza = store.orderPizza("cheese");
        System.out.println("Guille ordered a " + pizza.getName() + "\n");

        pizza = store.orderPizza("onion");
        System.out.println("Flor ordered a " + pizza.getName() + "\n");

    }
}