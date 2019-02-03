package animal;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    List<Animal> animals;
    int freeSlots;
    static int counter = 0;

    public Farm (){
        this.animals = new ArrayList<>();
        freeSlots = 15;
    }
    public int getAnimalThirst(Animal animalToGet){
        return animalToGet.thirst;
    }

    public void addAnimal(Animal animal){

        this.animals.add(animal);
        this.counter ++;
        freeSlots -= 1;
    }
    public int getCounter (){
        return counter;
    }

    public void breed (){
        if (freeSlots > 0) {

            Animal newAnimal = new Animal();
            animals.add(newAnimal);
            counter ++;
            freeSlots -= 1;
            System.out.println("The number of remainig slots are: " + freeSlots);
        }else {
            System.out.println("Sorry, there is no place for another animal. The number of free slots: ");
        }
    }

    public void slaughter (){
      /*  Animal leastHunger = new Animal();*/
        int leastHunger = this.animals.get(0).hunger;
        int indexOfLeastHunger=0;
/*        for (Animal animal:this.animals
             ) {
            if(animal.hunger < leastHunger.hunger){
                leastHunger = animal;
            }
        }*/
        for (int i = 0; i < this.animals.size() ; i++) {
            if(animals.get(i).hunger< leastHunger){
                indexOfLeastHunger = i;
            }
        }
        animals.remove(indexOfLeastHunger);



/*        List<Animal> temp = new ArrayList<>();
        temp = this.animals;

        for (int i = 0; i < animals.size(); i++) {

            if(leastHunger == animals.get(i)){
                temp.remove(leastHunger);
            }
        }*/
        /*animals = temp;*/

        freeSlots ++;
    }

}
