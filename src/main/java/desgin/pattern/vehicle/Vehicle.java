package desgin.pattern.vehicle;

public interface Vehicle {
    public String getColor();
    public void setColor(String color);
    public String getType();
    public void setType(String type);
    public int getDisplacement();
    public void setDisplacement(int displacement) ;
    public boolean hasSunroof() ;
    public void setSunroof(boolean sunroof);
    public int getSpeed() ;
    public void setSpeed(int speed);
    public boolean isAvailable() ;
    public void setAvailable(boolean available) ;
}
