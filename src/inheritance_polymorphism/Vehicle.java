package inheritance_polymorphism;

public class Vehicle {
    String vehicleName ;
    boolean hasGas;

    public Vehicle(String n, boolean hasGas) {
        this.vehicleName = n ;
        this.hasGas = hasGas ;
    }

    public boolean getHasGas(){return this.hasGas;}

    public void start(){
        if(getHasGas()){
            System.out.printf("Vehicle %s started\n",this.vehicleName);
        }else{
            System.out.printf("Vehicle %s cannot be started due to gas shortage\n",this.vehicleName);
        };

    }
}
