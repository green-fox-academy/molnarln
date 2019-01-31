package factorio;

public class Refactorio {
    public static void main(String[] args) {
        // Create a recursive function called `refactorio`
        // that returns it's input's factorial
        int a = 5;
        System.out.println(factorio(a));
    }
    public static int factorio(int a){

        if (a == 1){
            return 1;
        }
        return factorio(a-1)*a;
    }
}
