import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class homeAsListPractice {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(11,22,33,44,55,66));
        System.out.println(list.toString()+ " - this is an arraylist of integers");

        Integer[] newArray = list.toArray(new Integer[list.size()]);

        System.out.println(Arrays.toString(newArray) + " - this is an array of integers made from the arraylist of integers by toArray");

        String[] stringArray ={"one", "two", "three", "four", "five"};
        List listedArray = Arrays.asList(stringArray);

        listedArray.set(0, "changed");

        System.out.println(Arrays.toString(stringArray) + " - this is stringarray. After list (wrapped list) is modified, the origin string array is being modified also.");

        ArrayList<String> stringArrayList = new ArrayList<>(listedArray);

        System.out.println(stringArrayList.toString() + " - this is a string arraylist");

    }
}
