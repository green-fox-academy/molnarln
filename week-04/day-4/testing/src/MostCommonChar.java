import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MostCommonChar {

    public char countLetters (String inputString) {

        Map<Character, Integer> map = new HashMap<>();

        ArrayList<Character> arrayFromString = new ArrayList<>();

        for (char c: inputString.toCharArray()
        ) {
            arrayFromString.add(c);
        }
        for (char c : arrayFromString) {
            int currentNumOccurence = 1;

            for (char z : arrayFromString) {
                if (z == c){
                    map.put(c, currentNumOccurence);
                    currentNumOccurence++;
                }
            }
        }
        int maxvalue = 0;
        char mostCommon = ' ';
        for (int value: map.values()
             ) {
            if (value > maxvalue){
                maxvalue = value;
            }
        }
        for (char c: map.keySet()
             ) {
            if (map.get(c).equals(maxvalue)){
                mostCommon = c;
            }
        }
        return mostCommon;
    }
}
