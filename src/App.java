public class App {

    public static void main(String[] args) throws Exception {

        Beverage beverage = new DarkRoast();
        beverage.setSize("GRANDE");
        beverage = new Mocha(beverage);
        System.out.println(beverage.getSize() + " " + beverage.getDescription() + " $ " + beverage.cost());

    }
}
