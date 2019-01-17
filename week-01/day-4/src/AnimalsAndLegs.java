import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have
        System.out.println("How many chickens do you have?");

        Scanner scanner = new Scanner(System.in);
        int chickenLegs = scanner.nextInt() * 2;
        //System.out.println(chickenLegs);

        System.out.println("How many pigs do you have?");

        int pigLegs = scanner.nextInt() * 4;
        //System.out.println(pigLegs);

        int sumOfLegs = chickenLegs + pigLegs;

        System.out.println("The sum of the legs: " + sumOfLegs);



    }
}
