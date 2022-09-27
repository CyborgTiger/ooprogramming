public class CarOwner extends Person{
    private Person person;
    private Car car;
    public CarOwner(Person person, Car car){
        super(person.getName(), person.getAddress(), person.getAge());
        this.person = person;
        this.car = car;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "CarOwner{" +
                "person=" + person +
                ", car=" + car +
                '}';
    }
}
