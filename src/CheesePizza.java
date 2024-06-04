public class CheesePizza extends Pizza {

    PizzaIngredienteFactory ingredienteFactory;

    public CheesePizza(PizzaIngredienteFactory ingredienteFactory) {
        this.ingredienteFactory = ingredienteFactory;
    }

    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredienteFactory.createDough();
        sauce = ingredienteFactory.createSauce();
        chesse = ingredienteFactory.createCheese();
    }

}
