package Q7;

import javax.imageio.stream.ImageInputStream;

public class Car {
    public String licensePlate;
    public double speed; // kilometers per hour
    public double maxSpeed; // kilometers per hour

    // constructors
    public Car(String licensePlate1, double maxSpeed1) {
        this.licensePlate = licensePlate1;
        this.speed = 0.0;
        if (maxSpeed1 >= 0.0) {
            maxSpeed = maxSpeed1;
        }
        else {
            maxSpeed = 0.0;
        }

    }
    public Car(String licensePlate1, double maxSpeed1, double speed1) {
        this.licensePlate = licensePlate1;
        this.speed = speed1;
        if (speed1 < 0) {
            speed = 0.0;
        }
        else if (speed1 < maxSpeed1){
            this.maxSpeed = speed;
        }

    }


}
