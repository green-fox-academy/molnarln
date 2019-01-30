import java.util.ArrayList;
import java.util.HashMap;

public class DoableHomework {
    public static void main(String[] args) {
        //Create 5 trees
        //Store the data of them in variables in your program
        //for every tree the program should store its'
        //type
        //leaf color
        //age
        //sex
        //you can use just variables, or lists and/or maps

        ArrayList<HashMap<String, Object>> listOfMaps = new ArrayList<>();

        HashMap<String, Object> tree1 = new HashMap<>();
        tree1.put("type", "nut");
        tree1.put("leaf color", "light green");
        tree1.put("age", 80);
        tree1.put("sex", "male");
        listOfMaps.add(tree1);

        HashMap<String, Object> tree2 = new HashMap<>();
        tree2.put("type", "birch");
        tree2.put("leaf color", "darkgreen");
        tree2.put("age", 90);
        tree2.put("sex", "female");
        listOfMaps.add(tree2);

        HashMap<String, Object> tree3 = new HashMap<>();
        tree3.put("type", "willow");
        tree3.put("leaf color", "light green");
        tree3.put("age", 55);
        tree3.put("sex", "male");
        listOfMaps.add(tree3);

        HashMap<String, Object> tree4 = new HashMap<>();
        tree4.put("type", "pine");
        tree4.put("leaf color", "grey");
        tree4.put("age", 40);
        tree4.put("sex", "female");
        listOfMaps.add(tree4);

        HashMap<String, Object> tree5 = new HashMap<>();
        tree5.put("type", "maple");
        tree5.put("leaf color", "brown");
        tree5.put("age", 110);
        tree5.put("sex", "male");
        listOfMaps.add(tree5);

        for (HashMap tree: listOfMaps
             ) {
            System.out.println(tree);
        }


    }
}
