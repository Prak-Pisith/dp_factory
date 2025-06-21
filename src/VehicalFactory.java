abstract class VehicalFactory {

    public abstract Vehicle createVehicle();

    public Vehicle orderVehicle() {
        Vehicle vehicle = createVehicle();
        vehicle.getInfo();
        return vehicle;
    }
}
