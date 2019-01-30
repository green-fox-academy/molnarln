package sharpie;

public class inkUsage {
    public static void main(String[] args) {
        Sharpie first = new Sharpie("blue", 34);
        System.out.println(first.color + " " + first.width + " " + first.inkAmount);

        first.use();

        System.out.println(first.color + " " + first.width + " " + first.inkAmount);

    }

}
