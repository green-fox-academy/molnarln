package animal;

public class PlayWithAnimals {
    public static void main(String[] args) {
        Animal dog = new Animal();
        System.out.println(dog.hunger);
        System.out.println(dog.thirst);

        dog.eat();
        dog.drink();
        dog.eat();
        dog.drink();
        System.out.println(dog.hunger);
        System.out.println(dog.thirst);

        dog.play();
        System.out.println(dog.hunger);
        System.out.println(dog.thirst);


    }
}
