import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {
        // Write a program that reads a number from the standard input,
        // Then prints "Odd" if the number is odd, or "Even" if it is even.
        System.out.println("What is the number?");
        Scanner scanner=new Scanner(System.in);

        int num = scanner.nextInt();

        if(num % 2 == 0){
            System.out.println("The number is Even!");

        } else{
            System.out.println("The number is Odd!");

        }


    }
}
