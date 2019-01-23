import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
    public static void main(String... args) {
        // Create a simple calculator application which reads the parameters from the prompt
        // and prints the result to the prompt.
        // It should support the following operations,
        // create a method named "calculate()":
        // +, -, *, /, % and it should support two operands.
        // The format of the expressions must be: {operation} {operand} {operand}.
        // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

        // You can use the Scanner class
        // It should work like this:

        // Start the program
        // It prints: "Please type in the expression:"
        // Waits for the user input
        // Print the result to the prompt
        // Exit
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type in the expression: ");

        ArrayList <Double> expression = new ArrayList<>();

        char operation = scanner.next().charAt(0);
        double operand1 = scanner.nextInt();
        double operand2 = scanner.nextInt();
        double output;


        expression.add(0, operand1);
        expression.add(1, operand2);

        if(operation == '+'){
            output = expression.get(0) + expression.get(1);
            System.out.println(output);
        }else if (operation == '*'){
            output = expression.get(0) * expression.get(1);
            System.out.println(output);
        }else if (operation == '/'){
            output = expression.get(0) / expression.get(1);
            System.out.println(output);
        }else if (operation == '-'){
            output = expression.get(0) -expression.get(1);
            System.out.println(output);
        }
    }
}