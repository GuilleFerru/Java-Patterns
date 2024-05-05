public class App {
    public static void main(String[] args) throws Exception {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        // mallard.display();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
        model.performQuack();
        model.setQuackBehavior(new MimicQuack());
        model.performQuack();

    }
}
