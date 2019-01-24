public class ClassLocalVariable {

    public static void main(String[] args) {
        int a = 1;
        int b = 5;
        System.out.println(a);
        int c = modify(a, b);
        System.out.println(a);
        System.out.println(c);
    }
    public static int modify (int a, int b){
        a = a+1;
        int output = a + b;

        return output;
    }
}
