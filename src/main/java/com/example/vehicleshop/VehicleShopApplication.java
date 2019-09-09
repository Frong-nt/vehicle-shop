package com.example.vehicleshop;

import desgin.pattern.vehicle.Car;
import desgin.pattern.vehicle.Vehicle;
import desgin.pattern.vehicle.VehicleFactory;
import desgin.pattern.vehicle.VehicleSingleton;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
public class VehicleShopApplication {
    private VehicleSingleton singleton = VehicleSingleton.getInstance();
    private VehicleFactory vehicleFactory = new VehicleFactory();
    public static void main(String[] args) {
        SpringApplication.run(VehicleShopApplication.class, args);
    }

    @RequestMapping("/")
    public String home(){
        String s = "/create/{vehicle}\t=> create 'Car' or 'Plane'\n\n";
        s+= "/get/{index}\t\t=> get specific vehicle\n\n";
        s+= "/all\t\t\t\t=> return all vehicle\n\n";
        s+= "/delete/{index}\t\t=> delete specific vehicle\n\n";
        s+= "/update/{index}\t\t=> update specific vehicle\n\n";
        s+= "/all-car\t\t\t=> get all of Cars\n\n";
        s+= "/all-plane\t\t\t=> get all of Planes";
        return s;
    }

    @RequestMapping("/all")
    public List<Vehicle> allVehicle(){
        return singleton.getAllVehicles();
    }

    @RequestMapping(value = "/create/{vehicle}", method = RequestMethod.POST)
    public ResponseEntity<List<Vehicle>> create(@RequestBody Vehicle v,@PathVariable("vehicle") String vehicleType) {
        //to create specific type fo vehicle like car of plane
        Vehicle vehicle = vehicleFactory.getVehicle(vehicleType);

        vehicle.setFuel(v.getFuel());
        vehicle.setAvailable(v.isAvailable());
        vehicle.setSpeed(v.getSpeed());
        vehicle.setColor(v.getColor());
        vehicle.setType(v.getType());

        // if we just pass v as argument in the first place then we cant know that what is the exactly type of v,
        // because we pass v as parameter in type Of Vehicle not Car or Plane so the above line of code to make sure
//        that we already check and create the exactly type.
        this.singleton.createVehicle(vehicle);
        return new ResponseEntity<List<Vehicle>>(this.singleton.getAllVehicles(), HttpStatus.OK);
    }

    @RequestMapping(value = "/get/{index}")
    public ResponseEntity<Vehicle> get(@PathVariable("index") int index) {
        return new ResponseEntity<Vehicle>( singleton.getVehicle(index), HttpStatus.OK);
    }

    @RequestMapping(value = "/update/{index}", method = RequestMethod.POST)
    public ResponseEntity<List<Vehicle>> update(@PathVariable("index")int index, @RequestBody Vehicle vehicle) {
        this.singleton.update(index, vehicle);
        return new ResponseEntity<List<Vehicle>>(this.singleton.getAllVehicles(), HttpStatus.OK);
    }

    @RequestMapping(value = "/delete/{index}")
    public ResponseEntity<List<Vehicle>> delete(@PathVariable("index") int index) {
        this.singleton.delete(index);
        return new ResponseEntity<List<Vehicle>>(this.singleton.getAllVehicles(), HttpStatus.OK);
    }

    @RequestMapping(value = "/all-car")
    public ResponseEntity<List<Vehicle>> getAllCar() {
        return new ResponseEntity<List<Vehicle>>(this.singleton.getAllCar(), HttpStatus.OK);
    }

    @RequestMapping(value = "/all-plane")
    public ResponseEntity<List<Vehicle>> getAllPlane() {
        return new ResponseEntity<List<Vehicle>>(this.singleton.getAllPlane(), HttpStatus.OK);
    }



}
