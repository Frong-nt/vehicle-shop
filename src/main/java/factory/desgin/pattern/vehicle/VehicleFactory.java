package factory.desgin.pattern.vehicle;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class VehicleFactory implements Serializable {
    public VehicleFactory(){}

    public Vehicle getVehicle(String vehicleType){
        if(vehicleType == null){
            return null;
        }
        if(vehicleType.equalsIgnoreCase("Car")){
            return new Car();
        } else if(vehicleType.equalsIgnoreCase("Motorcycle")){
            return new Motorcycle();

        }
        return null;
    }
    public static Vehicle creatCar(String model, int wheel, String motto, double cost, boolean isAvailable){
        Vehicle car = new VehicleFactory().getVehicle("Car");
        car.setModel(model);
        car.setMotto(motto);
        car.setWheel(wheel);
        car.setCost(cost);
        car.setAvailable(isAvailable);
        return car;
    }
    public static Vehicle creatMotorcycle(String model, int wheel, String motto, double cost, boolean isAvailable){
        Vehicle car = new VehicleFactory().getVehicle("Motorcycle");
        car.setModel(model);
        car.setMotto(motto);
        car.setWheel(wheel);
        car.setCost(cost);
        car.setAvailable(isAvailable);
        return car;
    }
    public static List<Vehicle> getAllVehicle(){
        LinkedList<Vehicle> vehicles = new LinkedList<>();
        vehicles.add(VehicleFactory.creatCar("Yaris ATIV", 4, "LIFE ACTIVATED", 479000, true));
        vehicles.add(VehicleFactory.creatCar("Yaris", 4, "YES, THAT'S RIGHT", 489000, true));
        vehicles.add(VehicleFactory.creatCar("Vios", 4, "ALL IS POSSIBLE", 609000, true));
        vehicles.add(VehicleFactory.creatCar("Altis", 4, "MAKE A NEW HIGH", 829000, false));
        vehicles.add(VehicleFactory.creatCar("new-lexi-125-vva-รุ่น-s version สีดำ", 2, null, 63900 , true));
        vehicles.add(VehicleFactory.creatCar("New-YZF-R3-2019", 2, null, 199500 , true));
        vehicles.add(VehicleFactory.creatCar("New Exciter 150 [2019] ", 2, null, 63000 , true));
        vehicles.add(VehicleFactory.creatCar("NEW Grand Filano Hybrid ABS", 2, null, 62000 , false));

        return vehicles;
    }
    public static List<Vehicle> vehicleAvailable(){
        LinkedList<Vehicle> vehicles = new LinkedList<>();
        for(Vehicle v: getAllVehicle()){
            if(v.isAvailable()){
               vehicles.add(v);
            }
        }
        return vehicles;
    }
    public static List<Vehicle> getAllMotorcycle(){
        LinkedList<Vehicle> vehicles = new LinkedList<>();
        for(Vehicle v: getAllVehicle()){
            if(v.getWheel()==2){
                vehicles.add(v);
            }
        }
        return vehicles;
    }
}
