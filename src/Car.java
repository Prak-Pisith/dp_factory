public class Car implements Vehicle {
    private final String model;

    public Car(String model) {
        this.model = model;
    }

    @Override
    public String getType() {
        return "Car - " + model;
    }
}
