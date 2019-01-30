package counter;

public class Counter {
    int state;
    int initialStateCopy;

    public Counter(){
        initialStateCopy = state;
    }

    public Counter(int state){
        this.state = state;
        initialStateCopy = state;
    }

    public void add(){
        state += 1;
    }

    public void add(int number){
        state += number;
    }

    public int get(){
        return state;
    }

    public void reset(){
        state = initialStateCopy;
    }
}
