public class PizzaTestDrive {

    public static void main(String[] args) throws Exception {
        PizzaStore nyStore = new NYPizzaStore();
        //PizzaStore chicagoStore = new ChicagoPizzaStore();
        Pizza pizza;
        

        pizza = nyStore.orderPizza("cheese");
        System.out.println("Guille ordered a " + pizza.getName() + "\n");

      


    }
}