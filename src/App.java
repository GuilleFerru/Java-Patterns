public class App {


    public static void main(String[] args) throws Exception {

        Beverage beverage = new DarkRoast();
        beverage = new Mocha(beverage);
        beverage = new SteamedMilk(beverage);
        System.out.println(beverage.getDescription() + " $ " + beverage.cost());

    }
}
