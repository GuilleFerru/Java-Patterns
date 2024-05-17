public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        System.out.println(beverage);
        this.beverage = beverage;
    }


    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        System.out.println(beverage.cost() + " mocha");
        return 0.20d + beverage.cost();

    }

}