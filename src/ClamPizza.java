public class ClamPizza extends Pizza {

    PizzaIngredienteFactory ingredienteFactory;

    public ClamPizza(PizzaIngredienteFactory ingredienteFactory) {
        this.ingredienteFactory = ingredienteFactory;
    }

    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredienteFactory.createDough();
        sauce = ingredienteFactory.createSauce();
        chesse = ingredienteFactory.createCheese();
        clams = ingredienteFactory.createClams();
    }

}
