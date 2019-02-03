package animal;

public class PlayWithAnimals {
    public static void main(String[] args) {
        Animal dog = new Animal();
        System.out.println(dog.hunger);
        System.out.println("------------------------------------------");
        dog.eat();
        dog.drink();
        dog.eat();
        dog.drink();
        System.out.println(dog.hunger);
        System.out.println("------------------------------------------");

        dog.play();
        System.out.println(dog.hunger);
        System.out.println("------------------------------------------");

        Farm farm1 = new Farm();
        farm1.addAnimal(new Animal());
        farm1.breed();
        farm1.breed();
        System.out.println(farm1.freeSlots);
        System.out.println(farm1.getCounter());
        farm1.addAnimal(new Animal());
        System.out.println(farm1.freeSlots);
        System.out.println(farm1.getCounter());
        farm1.animals.get(0).play();
        farm1.animals.get(1).play();
        farm1.animals.get(2).play();


        System.out.println("------------------------------------------");
        System.out.println(farm1.getAnimalThirst(dog));
        System.out.println("------------------------------------------");
        System.out.println("The hunger level of animals:");
        for (Animal animal:farm1.animals
             ) {
            System.out.println(animal.hunger);
        }
        System.out.println("------------------------------------------");
        System.out.println(farm1.animals.size());

        farm1.slaughter();

        for (Animal animal:farm1.animals
        ) {
            System.out.println(animal.hunger);
        }
        System.out.println("------------------------------------------");
        System.out.println("Free slots before slaughter: " + farm1.freeSlots);
        farm1.slaughter();
        for (Animal animal:farm1.animals
        ) {
            System.out.println(animal.hunger);
        }
        System.out.println("Free slots after slaughter: " + farm1.freeSlots);

        System.out.println("------------------------------------------");
        Animal cat = new Animal();
        farm1.addAnimal(cat);
        cat.play();
        cat.play();
        cat.play();

        for (Animal animal:farm1.animals
        ) {
            System.out.println(animal.hunger);
        }
    }
}
