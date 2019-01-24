import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class homeAsListPractice {
    public static void main(String[] args) {

        ArrayList<String> myArrayList = new ArrayList<String>(Arrays.asList("one", "two", "three", "four", "five"));
        System.out.println(myArrayList.toString()+ " - this is an ArrayList of strings");

        String[] stringArray =myArrayList.toArray(new String[myArrayList.size()]);
        System.out.println(Arrays.toString(stringArray) + "this is an array created form ArrayList");
        List listedArray = Arrays.asList(stringArray);
        System.out.println(listedArray.toString()+"this is the unchanged list");

        listedArray.set(0, "changed");

        System.out.println(Arrays.toString(stringArray) + " - this is stringarray. After list (wrapped list) is modified, the origin string array is being modified also.");
        ArrayList<String> stringArrayList = new ArrayList<>(listedArray);


        System.out.println(stringArrayList.toString() + " - this is a string arraylist");

    }
}
