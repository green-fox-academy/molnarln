package main.java.music;

public class Violin extends StringedInstrument {

    public Violin(){
        numberOfStrings = 4;
        name = "Violin";
    }
    public Violin(int numberOfStrings){
        super(numberOfStrings);
        this.name = "Violin";
    }
    public String sound(){
        return "that goes Screech";
    }

}
