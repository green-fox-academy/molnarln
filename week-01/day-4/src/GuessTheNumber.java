import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        // Write a program that stores a number, and the user has to figure it out.
        // The user can input guesses, after each guess the program would tell one
        // of the following:
        //
        // The stored number is higher
        // The stried number is lower
        // You found the number: 8

        System.out.println("Guess a number!");
        Scanner scanner = new Scanner(System.in);
        int attempt = scanner.nextInt();
        int num = 12;
        while(attempt!= num){
            if (attempt < num){
                System.out.println("The stored number is higher");
            }else   if (attempt> num){
                System.out.println("The stroed number is lower");

            }
            attempt = scanner.nextInt();

        }
        System.out.println("You found the number: " +num);

    }
}
