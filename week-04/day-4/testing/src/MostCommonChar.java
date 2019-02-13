import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MostCommonChar {

    public char countLetters (String inputString) {

        Map<Character, Integer> map = new HashMap<>();

        for (char c : inputString.toCharArray()) {
            int currentNumOccurence = 1;

            for (char z : inputString.toCharArray()) {
                if (z == c){
                    map.put(c, currentNumOccurence);
                    currentNumOccurence++;
                }
            }
        }
        System.out.println(map);
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
        System.out.println(maxvalue);
        return mostCommon;
    }
}
