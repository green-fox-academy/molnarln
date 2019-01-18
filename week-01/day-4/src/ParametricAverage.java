import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        // Write a program that asks for a number.
        // It would ask this many times to enter an integer,
        // if all the integers are entered, it should print the sum and average of these
        // integers like:
        //
        // Sum: 22, Average: 4.4
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write the number of values!");
        int num = scanner.nextInt();
        int sum = 0;
        for (int i=0; i<num; i++){
            int val = scanner.nextInt();
            sum += val;

        }
        int average = sum/num;
        System.out.println("Sum of values: " + sum);
        System.out.println("Average of values: " + average);
    }
}
