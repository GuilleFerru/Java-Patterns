public class App {
    public static void main(String[] args) throws Exception {

        Beverage beverage = new DarkRoast();
        System.out.println(1);



        beverage = new Mocha(beverage);
        System.out.println(2);
        //beverage = new Mocha(beverage);
        //beverage = new SteamedMilk(beverage);
        System.out.println(3);
        System.out.println(beverage.getDescription() + " $ " + beverage.cost());

    }
}
