public class Car {
    private String registryNumber;
    private String brand;

    public Car(String registryNumber, String brand) {
        this.registryNumber = registryNumber;
        this.brand = brand;
    }

    public String getRegistryNumber() {
        return registryNumber;
    }

    public void setRegistryNumber(String registryNumber) {
        this.registryNumber = registryNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "registryNumber='" + registryNumber + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
