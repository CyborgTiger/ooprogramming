package uppgift1a;

public class Person {
    private String name;
    private String address;
    private int age;

    protected Person(String name, String address, int age){
        this.name = name;
        this.address = address;
        this.age = age;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected String getAddress() {
        return address;
    }

    protected void setAddress(String address) {
        this.address = address;
    }

    protected int getAge() {
        return age;
    }

    protected void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "uppgift1a.Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}
