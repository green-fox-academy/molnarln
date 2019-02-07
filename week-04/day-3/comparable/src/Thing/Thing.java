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

    @Override
    public int compareTo(Thing thingToCompare){

        if (this.completed == thingToCompare.completed){
            return this.name.compareTo(thingToCompare.name);    // Itt a Thing objektumra vonatkozó compareTo-t írjuk felül, a
                                                                //  a belső stringeket vizsgáló compareTo változatlan marad
        }
        if (this.completed){
            return -1;
        }
        return 1;
    }

    @Override
    public String toString() {
        return (completed ? "[x] " : "[ ] ") + name;
    }
}