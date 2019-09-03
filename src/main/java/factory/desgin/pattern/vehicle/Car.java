package factory.desgin.pattern.vehicle;

public class Car implements Vehicle{
    private String model;
    private int wheel;
    private String motto;
    private double cost;
    private boolean available;
    Car(){}
    Car(String model, int wheel, String motto){
        this.model = model;
        this.wheel = wheel;
        this.motto = motto;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }


    public String getMotto() {
        return motto;
    }

    public void setMotto(String motto) {
        this.motto = motto;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
