interface Vehicle {
    String getType();

    default void getInfo() {
        System.out.println("This is a vehicle of type: " + getType());
    }
}
