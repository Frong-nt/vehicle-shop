package desgin.pattern.vehicle;
// java bean
public class Plane extends Vehicle{

    public Plane() {
    }

    public Plane(String color, int fuel, int speed, boolean available, String type) {
        super(color, fuel, speed, available, type);
    }

//    just additional information to tell that how much plane use fuel to fly
    public void fly(){
        if(getFuel()-200 >0){
            System.out.println("Fly.");
        }
        System.out.println("Please add Fuel.");
    }
}
