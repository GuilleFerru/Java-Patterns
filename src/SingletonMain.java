public class SingletonMain {

    public static void main(String[] args) throws Exception {

        
        
        ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();
        ChocolateBoiler chocolateBoiler2 = ChocolateBoiler.getInstance();
        

        System.out.println("Boiler is Empty?");
        System.out.println(chocolateBoiler.isEmpty());
        System.out.println("Filling boiler");
        chocolateBoiler.fill();
        System.out.println("Boiler is Empty?");
        System.out.println(chocolateBoiler.isEmpty());
        System.out.println("Boiler is Boiled?");
        System.err.println(chocolateBoiler.isBoiled());
        System.out.println("Boiling boiler");
        chocolateBoiler.boil();
        System.out.println("Boiler is Boiled?");
        System.err.println(chocolateBoiler.isBoiled());
        System.out.println("Draining boiler?");
        chocolateBoiler.drain();
        System.out.println("Boiler is Empty?");
        System.out.println(chocolateBoiler.isEmpty());
        


    }
}