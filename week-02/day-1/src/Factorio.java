public class Factorio {
    public static void main(String[] args) {
        //  Create the usual class wrapper
        //  and main method on your own.

        // - Create a function called `factorio`
        //   that returns it's input's factorial

        int parameter;
        parameter = 5;
        System.out.println(sum(parameter));

    }
    public static int sum(int input){
        int output = 1;
        for (int i = 1; i <= input; i++) {
            output = output * i;
        }
        return output;


    }

}
