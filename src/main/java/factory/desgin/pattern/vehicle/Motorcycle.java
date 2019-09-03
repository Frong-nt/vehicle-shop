package factory.desgin.pattern.vehicle;

public class Motorcycle implements Vehicle {
    private String model;
    private int wheel;
    private String motto;
    private double cost;
    private boolean available;
    @Override
    public String getMotto() {
        return null;
    }

    @Override
    public void setMotto(String motto) {

    }

    @Override
    public String getModel() {
        return null;
    }

    @Override
    public void setModel(String model) {

    }

    @Override
    public int getWheel() {
        return 0;
    }

    @Override
    public void setWheel(int wheel) {

    }

    @Override
    public double getCost() {
        return 0;
    }

    @Override
    public void setCost(double cost) {

    }

    @Override
    public boolean isAvailable() {
        return false;
    }

    @Override
    public void setAvailable(boolean available) {

    }
}
