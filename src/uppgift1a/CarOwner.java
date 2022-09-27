package uppgift1a;

import java.util.ArrayList;

public class CarOwner extends Person{
    private Person person;
    private ArrayList<Car> cars;
    protected CarOwner(Person person){
        super(person.getName(), person.getAddress(), person.getAge());
        this.person = person;
        this.cars = new ArrayList<>();
    }

    protected Person getPerson() {
        return person;
    }

    protected void setPerson(Person person) {
        this.person = person;
    }

    protected ArrayList<Car> getCars() {
        return cars;
    }

    protected void addCar(Car car) {
        cars.add(car);
    }

    protected void removeCar(Car car){
        cars.remove(car);
    }

    @Override
    public String toString() {
        return "uppgift1a.CarOwner{" +
                "person=" + person +
                ", cars=" + cars.toString() +
                '}';
    }
}
