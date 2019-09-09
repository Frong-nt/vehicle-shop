package desgin.pattern.vehicle;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

//ClassSingleton
public class VehicleSingleton {
    private static VehicleSingleton INSTANCE;
    private LinkedList<Vehicle> vehicles =new LinkedList<>();
    private VehicleSingleton() {
    }

    public static VehicleSingleton getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new VehicleSingleton();
        }

        return INSTANCE;
    }

    public LinkedList<Vehicle> getAllVehicles() {
        readFile();
        return vehicles;
    }

    private void readFile() {
        try{
            FileInputStream fi = new FileInputStream(new File("vehicleObject.txt"));
            ObjectInputStream oi = new ObjectInputStream(fi);

            vehicles = (LinkedList<Vehicle>) oi.readObject();

            oi.close();
            fi.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void setVehicles(LinkedList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public Vehicle getVehicle(int index){
        readFile();
        return vehicles.get(index);
    }

    public void createVehicle(Vehicle vehicle){
        try{
            FileOutputStream f = new FileOutputStream(new File("vehicleObject.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);
            vehicles.add(vehicle);

            o.writeObject(vehicles);

            o.close();
            f.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        }
    }

    public void update(int index, Vehicle vehicle){
        try{
            FileOutputStream f = new FileOutputStream(new File("vehicleObject.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);

            vehicles.get(index).setFuel(vehicle.getFuel());
            vehicles.get(index).setColor(vehicle.getColor());
            vehicles.get(index).setAvailable(vehicle.isAvailable());
            vehicles.get(index).setSpeed(vehicle.getSpeed());
            vehicles.get(index).setType(vehicle.getType());

            o.writeObject(vehicles);

            o.close();
            f.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        }
    }
    public void delete(int index){
        try{
            FileOutputStream f = new FileOutputStream(new File("vehicleObject.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);

            vehicles.remove(index);
            o.writeObject(vehicles);

            o.close();
            f.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        }
    }
    public List<Vehicle> getAllCar(){
        readFile();
        LinkedList<Vehicle> cars = new LinkedList<>();
        for(Vehicle car:getAllVehicles()){
            if(car instanceof  Car){
                cars.add(car);
            }
        }
        return cars;
    }
    public List<Vehicle> getAllPlane(){
        readFile();
        LinkedList<Vehicle> planes = new LinkedList<>();
        for(Vehicle plane:getAllVehicles()){
            if(plane instanceof  Plane){
                planes.add(plane);
            }
        }
        return planes;
    }
}
