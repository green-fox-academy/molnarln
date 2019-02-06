package zoo;

public class Reptile extends Animal {

    String breedMethod;

    public Reptile (String name) {
        super(name);
        this.breedMethod = "laying eggs";
    }




    public String breed () {
        return this.breedMethod;
    }


}
