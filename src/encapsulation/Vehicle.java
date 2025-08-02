package encapsulation;

public class Vehicle {
    String vehicleName ;
    int mileage;

    public Vehicle(String n, int mileage) {
        this.vehicleName = n ;
        this.mileage = mileage ;
    }

    public void start(){
        this.mileage+=1;
        System.out.printf("Vehicle %s has run for %d km\n",this.vehicleName,this.mileage);
    }
}
