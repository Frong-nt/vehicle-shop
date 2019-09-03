package factory.desgin.pattern.vehicle;

public interface Vehicle {
    public String getMotto();

    public void setMotto(String motto);

    public String getModel();

    public void setModel(String model);

    public int getWheel();

    public void setWheel(int wheel);
    public double getCost();

    public void setCost(double cost);
    public boolean isAvailable();

    public void setAvailable(boolean available);
}
