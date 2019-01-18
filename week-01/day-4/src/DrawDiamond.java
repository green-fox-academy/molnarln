/*import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // diamond like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //  *****
        //   ***
        //    *
        //
        // The diamond should have as many lines as the number was

        Scanner scanner = new Scanner(System.in);
        System.out.println("Add the number of rows!");
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            for (int k=0; k <= num-i; k++ ){
                System.out.print(" ");

            }
            for (int j = -1; j != i*2; j++) {
                System.out.print("*");
            }
            System.out.println("");

        }


        for ( int x = num; x ; x++) {
            for (int y = 1; y < num +1 ; y++) {
                System.out.print(" ");
            }

            for (int z = -1; z != x*2; z++) {
                System.out.print("*");
            }
            System.out.println("");


            }

        }
    }

*/