package sumdigit;

public class SumDigit {
    // Given a non-negative int n, return the sum of its digits recursively (no loops).
    // Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
    // divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
    public static void main(String[] args) {
        int n = 126;
        System.out.println(digitadder(n));
    }

    public static int digitadder(int n){
        int digit1 = n % 10;
        int newInt = (n / 10);

        if(digit1 > 0){
            return digit1+ digitadder(newInt);
        }
        return 0;
    }
}
