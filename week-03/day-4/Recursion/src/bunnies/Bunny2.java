package bunnies;

public class Bunny2 {
    public static void main(String[] args) {
        // We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
        // (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
        // have 3 ears, because they each have a raised foot. Recursively return the
        // number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

        int n = 6;
        System.out.println(bunnyEars2(n));
    }


    public static int bunnyEars2(int n){

        if (n!= 0 && n % 2 == 1) {
            return 2 + (bunnyEars2(n - 1));
        }

        if (n!= 0 && n % 2 == 0) {
            return 3 + (bunnyEars2(n - 1));
        }

        return 0;
    }
}
