package inheritance_polymorphism;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Vehicle myVehicle = new Vehicle("Vehicle 1",true);
//        myVehicle.start();
        Car myCar = new Car("Car 1",true);
        myCar.start();

        Car mySecondCar = new Car("Car 2",false);
        mySecondCar.start();

        Bicycle myBicycle = new Bicycle("Bicycle 1");
        myBicycle.start();
    }
}