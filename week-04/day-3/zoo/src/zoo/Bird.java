package zoo;

public class Bird extends Animal implements Flyable {

    String breedMethod;

    public Bird (String name) {
        super(name);
        this.breedMethod = "laying eggs";

    }

    @Override
    public void land() {
        System.out.println(this.name + " landed.");
    }

    @Override
    public void fly() {
        System.out.println("Flyin'...");
    }

    @Override
    public void takeOff() {
        System.out.println("Take off!!!");
    }

    public String breed () {
        return this.breedMethod;
    }
}
