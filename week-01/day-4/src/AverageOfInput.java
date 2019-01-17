import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args){
        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add the 1. number!");
        int num2 = scanner.nextInt();

        System.out.println("Add the 2. number!");
        int num1 = scanner.nextInt();

        System.out.println("Add the 3. number!");
        int num3 = scanner.nextInt();

        System.out.println("Add the 4. number!");
        int num4 = scanner.nextInt();

        System.out.println("Add the 5. number!");
        int num5 = scanner.nextInt();

        int sum = num1 + num2 + num3 + num4 + num5;
        int avg = sum / 5;

        System.out.println("Sum: " + sum + " Average: " + avg);

    }


}
