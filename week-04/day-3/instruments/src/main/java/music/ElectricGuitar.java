package main.java.music;

public class ElectricGuitar extends StringedInstrument {


    public ElectricGuitar(){
        numberOfStrings = 6;
        name = "Electric Guitar";
    }

    public ElectricGuitar(int numberOfStrings){
        super(numberOfStrings);
        this.name = "Electric Guitar";
    }

    protected String sound(){
        return "that goes Twang";
    }

}
