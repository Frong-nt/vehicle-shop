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

    public static void main(String[] args) {
        SpringApplication.run(VehicleShopApplication.class, args);
    }

    @RequestMapping("/")
    public String home(){
        String s = "/create\t\t\t\t=> create vehicle\n\n";
        s+= "/get/{index}\t\t=> show specific vehicle\n\n";
        s+= "/all\t\t\t\t=> return all vehicle\n\n";
        s+= "/delete/{index}\t\t=> delete specific vehicle\n\n";
        s+= "/update/{index}\t\t=> update specific vehicle";
        return s;
    }

    @RequestMapping("/all")
    public List<Vehicle> allVehicle(){
        return singleton.getAllVehicles();
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity<List<Vehicle>> create(@RequestBody Car car) {
        this.singleton.createVehicle(car);
        return new ResponseEntity<List<Vehicle>>(this.singleton.getAllVehicles(), HttpStatus.OK);
    }

    @RequestMapping(value = "/get/{index}")
    public ResponseEntity<Vehicle> get(@PathVariable("index") int index) {
        return new ResponseEntity<Vehicle>( singleton.getVehicle(index), HttpStatus.OK);
    }

    @RequestMapping(value = "/update/{index}", method = RequestMethod.POST)
    public ResponseEntity<List<Vehicle>> update(@PathVariable("index")int index, @RequestBody Car vehicle) {
        this.singleton.update(index, vehicle);
        return new ResponseEntity<List<Vehicle>>(this.singleton.getAllVehicles(), HttpStatus.OK);
    }

    @RequestMapping(value = "/delete/{index}")
    public ResponseEntity<List<Vehicle>> delete(@PathVariable("index") int index) {
        this.singleton.delete(index);
        return new ResponseEntity<List<Vehicle>>(this.singleton.getAllVehicles(), HttpStatus.OK);
    }

}
