package gr.aueb.cf.chapter10;

/**
 * Δημιουργία και εμφάνιση στιγμιοτύπων της κλάσης PointXYZ
 */
public class ProjectPointApp {

    public static void main(String[] args) {

        // Δημιουργία και ορισμός τιμών στιγμιοτύπων
        PointXYZ place1 = new PointXYZ();
        PointXYZ place2 = new PointXYZ(12,52,25);
        PointXYZ place3 = PointXYZ.probableZero();
        place1.setX(2);
        place1.setY(5);
        place1.setZ(10);

        // Εμφάνιση των στιγμιοτύπων
        System.out.println("Place1: " + place1.convertToString());
        System.out.printf("Place2: (%d,%d,%d) %n", place2.getX() , place2.getY() , place2.getZ());
        System.out.println("Place3: " + place3.convertToString());

    }

}
