package gr.aueb.cf.chapter10;

/**
 * Παράδειγμα κλάσης αμαξιών.
 * Δημιουργεί τα αμάξια, θέτοντας τους τιμές,
 * τα εμφανίζει στην οθόνη και στο τέλος, εμφανίζει και τον αριθμό
 * των αμαξιών που δημιουργηθήκαν.
 */
public class VehicleDriver {

    public static void main(String[] args) {

        Vehicle toyota = new Vehicle();
        Vehicle peugeot = new Vehicle("Family",2015,1800,false);

        toyota.setType("City");
        toyota.setReleaseYear(2017);
        toyota.setCubicCapacity(2000);
        toyota.setLongVehicle(true);

        System.out.println("Τύπος αυτοκινήτου: " + toyota.getType());
        System.out.println("Έτος Παραγωγής: "+ toyota.getReleaseYear());
        System.out.println("Κυβικά: "+ toyota.getCubicCapacity());
        System.out.println("Long Vehicle: "+ toyota.isLongVehicle());

        System.out.println();

        System.out.println("Τύπος αυτοκινήτου: " + peugeot.getType());
        System.out.println("Έτος Παραγωγής: "+ peugeot.getReleaseYear());
        System.out.println("Κυβικά: "+ peugeot.getCubicCapacity());
        System.out.println("Long Vehicle: "+ peugeot.isLongVehicle());

        System.out.println();

        System.out.println("Αριθμός αμαξιών : " + Vehicle.getVehicleCount());

    }

}
