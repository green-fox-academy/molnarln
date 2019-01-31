package counter;

public class Counter {
    public static void main(String[] args) {
        // Write a recursive function that takes one parameter: n and counts down from n.
        int n = 10;
        counter(n);

    }
    public static void counter(int n){
        if(n >= 0){
            System.out.println(n);
            counter(n-1);
        }

        return;
    }
}
