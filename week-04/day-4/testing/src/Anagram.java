import java.util.ArrayList;

public class Anagram {
    public boolean isAnagram (String firstString, String secondString){
        ArrayList<Character> firstArray = new ArrayList<>();
        ArrayList<Character> secondArray = new ArrayList<>();
        boolean isInOtherArray = false;
        if (firstString.length() != secondString.length()){
            return false;
        }
        for (char c : firstString.toCharArray()
             ) {
            firstArray.add(c);
        }
        for (char c : secondString.toCharArray()){
            secondArray.add(c);
        }

        for (char c : firstArray
             ) {
            if (secondArray.contains(c)){
                isInOtherArray = true;
            }else {
                return false;
            }
        }
        return isInOtherArray;
    }
}
