package uppgift1a;

public class uppgift1a {
    public static void main(String[] args) {
        CarOwner johnny = new CarOwner(new Person("John", "home", 22), new Car("aaa-111", "lambo"));
        System.out.println(johnny);
        johnny.setCar(new Car("bbb-222", "ferrari"));
        System.out.println(johnny);
    }
}
