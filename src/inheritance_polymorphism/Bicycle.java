package inheritance_polymorphism;

public class Bicycle extends Vehicle{
    public Bicycle(String n) {
        super(n, false);
    }

    @Override
    public void start() {
        System.out.printf("Bicycle %s started\n",this.vehicleName);
    }
}
