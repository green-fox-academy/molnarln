import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it

        System.out.println("Type the distance in km!");

        Scanner scanner = new Scanner(System.in);
        int km = scanner.nextInt();

        double miles = km * 1.6;

        System.out.println(miles);
    }
}