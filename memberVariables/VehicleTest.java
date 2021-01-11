public class VehicleTest {
    public static void main(String[] args) {
        Vehicle bike = new Vehicle();
        Vehicle car = new Vehicle();

        bike.setNumberOfWheels(2);
        bike.setColor("red");
        int bikeWheels = bike.getNumberOfWheels();
        String bikeColor = bike.getColor();

        car.setNumberOfWheels(4);
        car.setColor("green");
        int carWheels = car.getNumberOfWheels();
        String carColor = car.getColor();

        System.out.println("Bike Object - Wheels: " + bikeWheels + ", Color: " + bikeColor);
        System.out.println("Car Object - Wheels: " + carWheels + ", Color: " + carColor);
    }
}