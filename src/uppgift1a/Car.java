package uppgift1a;

public class Car {
    private String registryNumber;
    private String brand;

    protected Car(String registryNumber, String brand) {
        this.registryNumber = registryNumber;
        this.brand = brand;
    }

    protected String getRegistryNumber() {
        return registryNumber;
    }

    protected void setRegistryNumber(String registryNumber) {
        this.registryNumber = registryNumber;
    }

    protected String getBrand() {
        return brand;
    }

    protected void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "uppgift1a.Car{" +
                "registryNumber='" + registryNumber + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
