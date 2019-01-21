import java.lang.reflect.Array;
import java.util.Arrays;

public class Unique {
    public static void main(String[] args) {
        //  Create a function that takes a list of numbers as a parameter
        //  Returns a list of numbers where every number in the list occurs only once

        //  Example
        //System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
        //  should print: `[1, 11, 34, 52, 61]`
        int[] notUnique = {1, 11, 34, 11, 52, 61, 1, 34};


        System.out.println(Arrays.toString(unique(notUnique)));
    }

    public static int[] unique(int[] numArray){
            int[] temp;
            temp = numArray;


        for (int i = 0; i < numArray.length; i++) {
            for (int j = 0; j < i; j++) {
                if ( numArray[i] == temp[j]) {
                    System.out.print(numArray[i] + " " );
                }

            }
        }
        return numArray;
    }
}
