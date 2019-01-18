import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        // Create a program that asks for two numbers
        // If the second number is not bigger than the first one it should print:
        // "The second number should be bigger"
        //
        // If it is bigger it should count from the first number to the second by one
        //
        // example:
        //
        // first number: 3, second number: 6, should print:
        //
        // 3
        // 4
        // 5

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type number 1.!");
        int num1 = scanner.nextInt();

        System.out.println("Type number 2.!");
        int num2 = scanner.nextInt();

        if (num2 <= num1){
            System.out.println("The 2. number should be bigger!");
        }else {
            for (int i = num1; i != num2; i++) {
                System.out.println(num1);
                num1 ++;
            }
        }
}
}
