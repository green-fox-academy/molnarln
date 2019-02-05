package gardenapplication;

public class Plant {
    String color;
    int currentWaterAmount;
    int whenToWater;
    double absorptionRate;


    public Plant(String color) {
        this.color = color;
        this.currentWaterAmount = 0;
    }

    public void getState() {
        if (currentWaterAmount < 5) {
            System.out.println("The " + color + " Plant need water");
        } else {
            System.out.println("The " + color + " Plant doesnt need water.");
        }
    }


}

