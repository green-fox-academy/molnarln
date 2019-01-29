import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        // Create a function that takes a number
        // divides ten with it,
        // and prints the result.
        // It should print "fail" if the parameter is 0
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give a number!");
        int divideBy = scanner.nextInt();
        divider(divideBy);
    }

    public static void divider (int  divideBy){

        int a = 10;
        try {
            int c = a / divideBy;
            System.out.println(c);
        }catch (ArithmeticException ex){
            System.out.println("fail");
        }

    }


}
