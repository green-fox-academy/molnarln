package Thing;

/**
 * Created by aze on 2017.03.29..
 */
public class Thing implements Comparable<Thing> {
    private String name;
    private boolean completed;

    public Thing(String name, boolean completed) {
        this.name = name;
        this.completed = completed;
    }

    public void complete() {
        this.completed = true;
    }

    public int compareTo(Thing thingToCompare){
        if (this.completed == thingToCompare.completed){
            return this.name.compareTo(thingToCompare.name);
        }
        return this.name.compareTo(thingToCompare.name);

    }



    @Override
    public String toString() {
        return (completed ? "[x] " : "[ ] ") + name;
    }
}