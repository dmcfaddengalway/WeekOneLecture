
/**
 * Write a description of class Bicycle here.
 *
 * @author Daniel McFadden (16280010)
 * @version September 14th, 2017
 */
public class Bicycle {
    
    //Instance Variables
    private int speed;
    private int gear;
    private int cadence;

    //Constructor
    public Bicycle(int speed, int gear, int cadence) {
        this.speed = speed;
        this.gear = gear;
        this.cadence = cadence;
    }

    //Methods
    
        //Setters
        public void setSpeed(int newSpeed) {
            speed = newSpeed;
        }
        
        public void setGear(int newGear) {
            gear = newGear;
        }
        
        public void setCadence(int newCadence) {
            cadence = newCadence;
        }
        
        //Getters
        public int getSpeed() {
            return speed;
        }
        
        public int getGear() {
            return gear;
        }
        
        public int getCadence() {
            return cadence;
        }
    
}
