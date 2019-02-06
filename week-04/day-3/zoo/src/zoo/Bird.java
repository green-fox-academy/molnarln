package zoo;

public class Bird extends Animal {

    String breedMethod;

    public Bird (String name) {
        super(name);
        this.breedMethod = "laying eggs";

    }




    public String breed () {
        return this.breedMethod;
    }
}
