package desgin.pattern.vehicle;

import java.io.CharArrayReader;
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
        }else if(vehicleType.equalsIgnoreCase("Plane")){
            return new Plane();
        }
        return null;
    }
//    public static Vehicle creatCar(String color, int fuel, int speed, boolean available, String typeEngine){
//        Vehicle car = new VehicleFactory().getVehicle("Car");
//        car.setColor(color);
//        car.setSpeed(speed);
//        car.setAvailable(available);
//        car.setFuel(fuel);
//        ((Car)car).setTypeEngine(typeEngine);
//        return car;
//    }
//    public static Vehicle creatPlane(String color, int fuel, int speed, boolean available){
//        Vehicle plane = new VehicleFactory().getVehicle("Plane");
//        plane.setColor(color);
//        plane.setSpeed(speed);
//        plane.setAvailable(available);
//        plane.setFuel(fuel);
//        return plane;
//    }
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
