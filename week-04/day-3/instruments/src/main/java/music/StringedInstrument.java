package main.java.music;

public abstract class StringedInstrument extends Instrument {

    protected int numberOfStrings;

    public StringedInstrument () {

    }

    public StringedInstrument(int numberOfStrings){
        this.numberOfStrings = numberOfStrings;
    }

    abstract String sound ();

    protected void play(){
        System.out.println(this.name + " a " + numberOfStrings + "-stringed instrument " + this.sound());
    }

}
