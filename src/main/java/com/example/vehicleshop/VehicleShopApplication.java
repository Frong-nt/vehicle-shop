package com.example.vehicleshop;

import factory.desgin.pattern.vehicle.Car;
import factory.desgin.pattern.vehicle.Vehicle;
import factory.desgin.pattern.vehicle.VehicleFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class VehicleShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(VehicleShopApplication.class, args);
    }
    @RequestMapping("/")
    public String home(){
        String s = "/vehicle-detail\t\t\tto Return Vehicle Information\n\n/vehicle-available\t\tto Return Vehicle that AvailableOnly ";
        s+= "\n\n/motorcycle-detail\t\tto Return Motorcycle Information Only";
        return s;
    }
    @RequestMapping("/vehicle-detail")
    public List<Vehicle> allVehicle(){
        return VehicleFactory.getAllVehicle();
    }
    @RequestMapping("/vehicle-available")
    public  List<Vehicle> VehicleAvailable(){
        return VehicleFactory.vehicleAvailable();
    }
    @RequestMapping("/motorcycle-detail")
    public  List<Vehicle> motorcycle(){
        return VehicleFactory.getAllMotorcycle();
    }
}
