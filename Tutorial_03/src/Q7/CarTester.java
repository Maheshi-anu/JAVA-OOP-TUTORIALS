package Q7;

public class CarTester {
    public static void main(String[] args) {
        Car car1 = new Car("234566",90);
        System.out.println("Maximum Speed: "+ car1.maxSpeed);
        System.out.println("The license plate: "+ car1.licensePlate);

        Car car = new Car("2345",30,5);
        System.out.println("Maximum Speed: " + car.maxSpeed);
        System.out.println("The license plate: "+ car.licensePlate);

    }
}
