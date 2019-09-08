package desgin.pattern.vehicle;

import java.io.Serializable;

// java bean
public class Car implements Vehicle, Serializable {
    private String color;
    private String type;
    private int displacement;
    boolean sunroof;
    private int speed;
    private boolean available;

    public Car(){}
    public Car(String color, String type, int displacement, boolean sunroof, int speed, boolean available) {
        this.color = color;
        this.type = type;
        this.displacement = displacement;
        this.sunroof = sunroof;
        this.speed = speed;
        this.available = available;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getDisplacement() {
        return displacement;
    }
    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }
    public boolean hasSunroof() {
        return sunroof;
    }
    public void setSunroof(boolean sunroof) {
        this.sunroof = sunroof;
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
}
