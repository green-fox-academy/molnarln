import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        // Write a program that asks for two numbers and prints the bigger one
        Scanner sc = new Scanner(System.in);

        System.out.println("Type the first number!");
        double num1 = sc.nextDouble();

        System.out.println("Type the second number!");
        double num2 = sc.nextDouble();

        if (num1>num2){
            System.out.println(num1);
        } else  {
            System.out.println(num2);
        }
        


    }

}
