public class TwoNumbers {
    public static void main(String[] args) {
        // Create a program that prints a few operations on two numbers: 22 and 13
        int number1 = 22;
        int number2 = 13;

        // Print the result of 13 added to 22
        int sum = number1 + number2;
        System.out.println(sum);

        // Print the result of 13 substracted from 22
        int sub = number2 - number1;
        System.out.println(13-22);

        // Print the result of 22 multiplied by 13
        int multiplied = number1 * number2;
        System.out.println(multiplied);

        // Print the result of 22 divided by 13 (as a decimal fraction)
        int divided = number1 / number2;
        System.out.println(divided);
        // Print the integer part of 22 divided by 13
        int divided2 = number1 / number2;
        System.out.println(divided2);
        // Print the remainder of 22 divided by 13
        int remainder = number1 % number2;
        System.out.println(remainder);
    }
}