public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    public double cost() {
        System.out.println("cost DarkRoast");
        return .99;
    }
}
