public class methodsHomePractice {

    static double myPI = 3.14159; //Class Variable

    public static void main(String[] args) {

        addThem(1,2);
        System.out.println("global " + myPI);

    }

    public static void addThem (int a, int b) {

        double smallPi = 3.1; //local variable
        double myPI = 3.0;
        myPI = myPI + 4;
        System.out.println("local " + myPI);
    }


}
