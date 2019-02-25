package gardenapplication;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class GardenAppMain {
    public static void main(String[] args) {

        Flower flower1 = new Flower("yellow");
        Flower flower2 = new Flower("blue");
        Tree tree1 = new Tree("yellow");
        Tree tree2 = new Tree("blue");

        Garden garden1 = new Garden();
        garden1.plants.add(flower1);
        garden1.plants.add(flower2);
        garden1.plants.add(tree1);
        garden1.plants.add(tree2);

        List<Plant> listOfPlants = Arrays.asList(flower1, flower2, tree1, tree2);

        listOfPlants.stream()
                .filter(plant -> plant instanceof Tree)
                .forEach(plant -> System.out.println(plant.color));


        garden1.presentMyGarden();
        System.out.println();

        garden1.waterPlants(40);
        System.out.println();
        garden1.presentMyGarden();

        garden1.waterPlants(70);
        System.out.println();
        garden1.presentMyGarden();
    }
}
