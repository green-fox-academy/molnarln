package zoo;

public class Mammal extends Animal {

    String breedMethod;

    public Mammal (String name) {
        super(name);
        this.breedMethod = "pushing miniature versions out";
    }




    public String breed () {
        return this.breedMethod;
    }


}
