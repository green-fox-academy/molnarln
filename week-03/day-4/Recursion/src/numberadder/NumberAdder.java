package numberadder;

public class NumberAdder {
    public static void main(String[] args) {
        // Write a recursive function that takes one parameter: n and counts down from n.
        int n = 4;
        System.out.println(adder(n));

    }
    public static int adder(int n){

        if (n >= 1) {
            return n + adder(n - 1);
        } return 0;
    }
}