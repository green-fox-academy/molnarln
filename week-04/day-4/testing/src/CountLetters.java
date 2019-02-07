import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountLetters {

    public HashMap countLetters (String inputString) {

        Map<Character, Integer> map = new HashMap<>();

        ArrayList<Character> arrayFromString = new ArrayList<>();

        for (char c: inputString.toCharArray()
             ) {
            arrayFromString.add(c);
        }

        char currentUniqueChar = ' ';

        for (char c : arrayFromString) {
            int currentNumOccurence = 1;

            for (char z : arrayFromString) {
                if (z == c){
                    map.replace(c, currentNumOccurence);
                    currentNumOccurence++;

                }else{
                    currentUniqueChar = c;
                    map.put(currentUniqueChar, 0);
                }

            }
        }
        return (HashMap)map;

    }
}
