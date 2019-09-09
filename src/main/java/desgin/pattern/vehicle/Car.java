package desgin.pattern.vehicle;

import java.io.Serializable;

// java bean
public class Car extends Vehicle {
    public Car() {
    }

    public Car(String color, int fuel, int speed, boolean available, String type) {
        super(color, fuel, speed, available, type);
    }

    //    just additional information to tell that how much car use fuel to move
    public void move(){
        if(getFuel()-50 >0){
            System.out.println("Move.");
        }
        System.out.println("Please add Fuel.");
    }
}
