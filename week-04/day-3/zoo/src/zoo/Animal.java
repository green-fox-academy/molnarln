package zoo;

public abstract class Animal {
    String name;
    int age;
    String gender;


    public Animal (String name) {
        this.name = name;

    }



    public  String getName(){
        return this.name;
    }
    public abstract String breed();




}
