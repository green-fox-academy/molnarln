import java.lang.reflect.Array;
import java.util.*;

public class AppendLetter{
    public static void main(String... args){
        ArrayList<String> far =new ArrayList<>(Arrays.asList("bo", "anacond", "koal", "pand", "zebr"));
        // Create a method called "appendA()" that adds "a" to every string in the "far" list.
        // The parameter should be a list.

        System.out.println(appendA(far));
    }

    public static List appendA(List<String> inputList) {

        ArrayList<String> appendA = new ArrayList<>();

        for (int i = 0; i < inputList.size() ; i++) {
            appendA.add(inputList.get(i) + "a");
        }
        return appendA;
    }

}

// The output should be: "boa", "anaconda", "koala", "panda", "zebra"