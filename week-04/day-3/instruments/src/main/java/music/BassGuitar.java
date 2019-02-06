package main.java.music;

public class BassGuitar extends StringedInstrument {


    public BassGuitar(){
        numberOfStrings = 4;
        name = "Bass Guitar";
    }
    public BassGuitar(int numberOfStrings){
        super(numberOfStrings);
        this.name = "Bass Guitar";
    }
    protected String sound(){
        return "that goes Duum-duum-duum";
    }
}
