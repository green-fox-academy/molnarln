public class Sum {
    public static void main(String[] args) {
        //  Create the usual class wrapper
        //  and main method on your own.

        // - Write a function called `sum` that sum all the numbers
        //   until the given parameter and returns with an integer

        int parameter;
        parameter = 3;
        System.out.println(sum(parameter));

    }
    public static int sum(int input){
        int output = 0;
        for (int i = 0; i <= input; i++) {
            output = input + i;
        }
        return output;

    }

}

