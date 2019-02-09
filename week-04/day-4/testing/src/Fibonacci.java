public class Fibonacci {


    public static int indexOfFib(int index){
        int num1 = 0;
        int num0 = 1;
        int actualNum = 0;
        for (int i = 0; i < index ; i++) {
            actualNum = num0 + num1;
            num0 = num1;
            num1 = actualNum;
        }
        return actualNum;
    }
}
