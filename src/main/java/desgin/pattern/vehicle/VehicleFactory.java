package desgin.pattern.vehicle;

import java.util.LinkedList;
import java.util.List;
// factory design pattern
public class VehicleFactory{
    public VehicleFactory(){}

    public Vehicle getVehicle(String vehicleType){
        if(vehicleType == null){
            return null;
        }
        if(vehicleType.equalsIgnoreCase("Car")){
            return new Car();
        }
        return null;
    }
    public static Vehicle creatCar(String color,String type, int displacement, boolean sunroof, int speed, boolean available){
        Vehicle car = new VehicleFactory().getVehicle("Car");
        car.setColor(color);
        car.setDisplacement(displacement);
        car.setSpeed(speed);
        car.setSunroof(sunroof);
        car.setType(type);
        car.setAvailable(available);
        return car;
    }
//    public static List<Vehicle> getAllVehicle(){
//        LinkedList<Vehicle> vehicles = new LinkedList<>();
////        vehicles.add(VehicleFactory.creatCar("Yaris ATIV", 4, "LIFE ACTIVATED", 479000, true));
////        vehicles.add(VehicleFactory.creatCar("Yaris", 4, "YES, THAT'S RIGHT", 489000, true));
////        vehicles.add(VehicleFactory.creatCar("Vios", 4, "ALL IS POSSIBLE", 609000, true));
////        vehicles.add(VehicleFactory.creatCar("Altis", 4, "MAKE A NEW HIGH", 829000, false));
//        return vehicles;
//    }
//    public static List<Vehicle> vehicleAvailable(){
//        LinkedList<Vehicle> vehicles = new LinkedList<>();
//        for(Vehicle v: getAllVehicle()){
//            if(v.isAvailable()){
//               vehicles.add(v);
//            }
//        }
//        return vehicles;
//    }

}
