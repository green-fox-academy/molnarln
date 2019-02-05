package gardenapplication;

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
