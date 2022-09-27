package uppgift1a;

public class uppgift1a {
    public static void main(String[] args) {
        CarOwner johnny = new CarOwner(new Person("John", "home", 22));
        Car lambo = new Car("aaa-111", "lambo");
        johnny.addCar(lambo);
        System.out.println(johnny);
        Car ferrari1 = new Car("bbb-222", "ferrari");
        johnny.addCar(ferrari1);
        Car ferrari2 = new Car("bbb-223", "ferrari");
        johnny.addCar(ferrari2);
        Car ferrari3 = new Car("bbb-224", "ferrari");
        johnny.addCar(ferrari3);
        System.out.println(johnny);
        johnny.removeCar(ferrari2);
        System.out.println(johnny);
    }
}
