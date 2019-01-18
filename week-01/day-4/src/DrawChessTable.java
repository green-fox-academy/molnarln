import java.util.Scanner;

public class DrawChessTable {
    public static void main(String[] args) {
        // Crate a program that draws a chess table like this
        //
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        //
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a number!");

        int num = scanner.nextInt() - 1;

        for (int i = 0; i <= num; i++) {
            for (int j = 0; j <= num; j++) {
                if ((i+j)%2 == 0) {
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
