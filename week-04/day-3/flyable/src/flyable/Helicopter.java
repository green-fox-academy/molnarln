package flyable;

public class Helicopter extends Vehicle implements Flyable {

    public Helicopter(String name, int numberOfWheels, String type) {
        super(name, numberOfWheels, type);
    }

    public void land() {
        System.out.println(name + " landed.");
    }

    public void fly() {
        System.out.println(name + " is flying.");
    }

    public void takeOff() {
        System.out.println(name + " took off.");
    }
}
