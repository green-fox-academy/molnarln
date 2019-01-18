import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // square like this:
        //
        //
        // %%%%%%
        // %    %
        // %    %
        // %    %
        // %    %
        // %%%%%%
        //
        // The square should have as many lines as the number was
        Scanner scanner= new Scanner(System.in);
        System.out.println("Write a number!");

        int num = scanner.nextInt();

        for (int i = 0; i <= num; i++){
            System.out.print("%");
        }
        System.out.println();

        for (int j = 0; j < num-2; j++){
            System.out.print("%");

            for (int k=0; k <= num-2; k++) {
                System.out.print(" ");
            }
            System.out.println("%");
        }
        for (int i = 0; i <= num; i++) {
            System.out.print("%");
        }




    }
}
