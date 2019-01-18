import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // square like this:
        //
        //
        // %%%%%
        // %%  %
        // % % %
        // %  %%
        // %%%%%
        //
        // The square should have as many lines as the number was
        Scanner scanner= new Scanner(System.in);
        System.out.println("Write a number!");

        int num = scanner.nextInt()-1;

        for (int i= 0; i <= num; i++){
            for (int j = 0; j <= num; j++){
                if(i==j || i==0 || j==0 || i==num || j==num){
                    System.out.print("%");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
