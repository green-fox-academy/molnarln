package Thing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ThingMain {
    public static void main(String[] args) {
        Thing thing1 = new Thing("Milk", true);
        Thing thing2 = new Thing("Milkey Way", true);
        Thing thing3 = new Thing("Apple", false);
        Thing thing4 = new Thing("Desk", true);
        Thing thing5 = new Thing("Can", true);
        Thing thing6 = new Thing("Milk", false);
        Thing thing7 = new Thing("Butter", false);
        Thing thing8 = new Thing("Orange", true);
        Thing thing9 = new Thing("Water", true);
        Thing thing10 = new Thing("Bread", false);

        List <Thing> thingsToDo = new ArrayList<>();
        thingsToDo.add(thing1);
        thingsToDo.add(thing2);
        thingsToDo.add(thing3);
        thingsToDo.add(thing4);
        thingsToDo.add(thing5);
        thingsToDo.add(thing6);
        thingsToDo.add(thing7);
        thingsToDo.add(thing8);
        thingsToDo.add(thing9);
        thingsToDo.add(thing10);

        System.out.println(thingsToDo);
        Collections.sort(thingsToDo);
        System.out.println(thingsToDo);

    }

}
