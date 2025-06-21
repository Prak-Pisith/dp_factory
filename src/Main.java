public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        // Vehical Factory

        CarFactory carFactory = new CarFactory("Tesla Model 3");
        Vehicle car = carFactory.orderVehicle();
        System.out.println("Ordered vehicle: " + car.getType());
    }
}