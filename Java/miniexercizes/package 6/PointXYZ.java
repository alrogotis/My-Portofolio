package gr.aueb.cf.chapter10;

import java.util.Random;

/**
 * Παράδειγμα κλάσης που απεικονίζει ενα τρισδιάστατο σημείο.
 * Παρέχει 3 constructors. Έναν default, Έναν overloaded και έναν static factory
 * Παρέχει επίσης setters και getters για κάθε μεταβλητή.
 * Τέλος, έχει και μια μέθοδο, η οποία μετατρέπει τα αποτελέσματα σε string
 */
public class PointXYZ {
    // Δήλωση μεταβλητών
    private int x;
    private int y;
    private int z;

    // Default constructor
    public PointXYZ () {}

    // Overloaded constructor
    public PointXYZ( int x, int y, int z ) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * static factory constructor που δημιουργεί
     * ενα instance της κλάσης, με τυχαίες τιμές.
     * @return το instance της κλάσης.
     */
    public static PointXYZ probableZero(){
        Random r = new Random();
        return new PointXYZ ( r.nextInt (201) -100 , r.nextInt (201) -100 , r.nextInt (201) -100 );
    }

    // setters και getters
    public int getX() { return x; }

    public void setX(int x) { this.x = x; }

    public int getY() { return y; }

    public void setY(int y) { this.y = y; }

    public int getZ() { return z; }

    public void setZ(int z) { this.z = z; }

    /**
     * Μέθοδος που μετατρέπει ενα instance της κλάσης σε string
     * @return το string
     */
    public String convertToString(){
        return "(" + x + "," + y + "," + z + ")";
    }
}
