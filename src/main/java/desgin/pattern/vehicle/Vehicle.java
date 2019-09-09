package desgin.pattern.vehicle;

import java.io.Serializable;
// java bean
public class Vehicle implements Serializable {
    private String color;
    private int fuel;
    private int speed;
    private boolean available;
    private String type;
    public Vehicle(){}

    public Vehicle(String color, int fuel, int speed, boolean available, String type) {
        this.color = color;
        this.fuel = fuel;
        this.speed = speed;
        this.available = available;
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
