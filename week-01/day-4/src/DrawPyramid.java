import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // pyramid like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //
        // The pyramid should have as many lines as the number was

        Scanner scanner = new Scanner(System.in);
        System.out.println("Add the number of rows!");
        int num = scanner.nextInt();

        for (int i = 0; i != num; i++) {
            for (int k=0; k <= num-i; k++ ){
                System.out.print(" ");

            }
            for (int j = -1; j != i*2; j++) {
                System.out.print("*");
            }
            System.out.println("");

        }

    }
}