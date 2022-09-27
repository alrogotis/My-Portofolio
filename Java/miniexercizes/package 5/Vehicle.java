package gr.aueb.cf.chapter10;

/**
 * Παράδειγμα POJO class, Java Bean
 */
public class Vehicle {

    // Μεταβλητές προγράμματος
    private static int vehicleCount = 0;
    private String type;
    private  int releaseYear;
    private  int cubicCapacity;
    private  boolean longVehicle;

    // Default constructor
    public Vehicle(){
        vehicleCount++;
    }

    // static getter
    public static int getVehicleCount(){
        return vehicleCount;
    }

    // Overloaded Constructor
    public Vehicle(String type, int releaseYear, int cubicCapacity, boolean longVehicle) {
        this.type = type;
        this.releaseYear = releaseYear;
        this.cubicCapacity = cubicCapacity;
        this.longVehicle = longVehicle;
        vehicleCount++;

    }

    // Setter and Getters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getCubicCapacity() {
        return cubicCapacity;
    }

    public void setCubicCapacity(int cubicCapacity) {
        this.cubicCapacity = cubicCapacity;
    }

    public boolean isLongVehicle() {
        return longVehicle;
    }

    public void setLongVehicle(boolean longVehicle) {
        this.longVehicle = longVehicle;
    }

}
