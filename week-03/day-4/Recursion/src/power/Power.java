package power;

public class Power {
    // Given base and n that are both 1 or more, compute recursively (no loops)
    // the value of base to the n power, so powerN(3, 2) is 9 (3 squared).
    public static void main(String[] args) {
        int base = 3;
        int power = 3;
        System.out.println(toPower(base, power));
    }

    public static int toPower(int base, int power){

        if(power > 1){
            return base * toPower(base,power-1);
        }

        return base;
    }
}
