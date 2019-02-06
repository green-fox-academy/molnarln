package gardenapplication;

import java.util.ArrayList;
import java.util.List;

public class Garden {
    List<Plant> plants;

    public Garden () {
        plants = new ArrayList<>();
    }

    public void waterPlants (int amountOfWater) {
        int divider = 0;
        for (Plant plant: plants
             ) {
            if (plant.currentWaterAmount < plant.whenToWater){
                divider ++;
            }
        }
        for ( Plant plant:plants
             ) {
            if (plant.currentWaterAmount < plant.whenToWater){
                plant.currentWaterAmount += (amountOfWater / divider) * plant.absorptionRate;
            }
        }
    }

    public void presentMyGarden () {
        for (Plant plant:plants
             ) {
            plant.getState();
        }
    }
}
