package gardenapplication;

public class Tree extends Plant {

    public Tree (String color) {
        super(color);
        whenToWater = 10;
        this.absorptionRate = 0.4;
    }

    @Override
    public void getState () {
        if (currentWaterAmount < whenToWater){
            System.out.println("The " + color + " Tree need water");
        }else {
            System.out.println("The " + color + " Tree doesnt need water.");
        }
    }
}
