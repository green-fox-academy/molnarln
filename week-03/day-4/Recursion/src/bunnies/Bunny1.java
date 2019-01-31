package bunnies;

public class Bunny1 {
    public static void main(String[] args) {
        // We have a number of bunnies and each bunny has two big floppy ears.
        // We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
        int n = 2;
        System.out.println(bunnyEars(n));
    }
    public static int bunnyEars(int n){

        if (n!= 0) {
            return 2 + (bunnyEars(n - 1));
        }
        return 0;
    }
}


