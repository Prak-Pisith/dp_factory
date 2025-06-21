public class CarFactory extends VehicalFactory {

    private final String model;

    public CarFactory(String model) {
        this.model = model;
    }

    @Override
    public Vehicle createVehicle() {
        return new Car(model);
    }

}
