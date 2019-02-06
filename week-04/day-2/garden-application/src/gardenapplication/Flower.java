package gardenapplication;

public class Flower extends Plant {


    public Flower (String color) {
    super(color);
    this.whenToWater = 5;
    this.absorptionRate = 0.75;
    }

    @Override
    public void getState () {
        if (currentWaterAmount < whenToWater){
            System.out.println("The " + color + " Flower need water");
        }else {
            System.out.println("The " + color + " Flower doesnt need water.");
        }
    }
}
