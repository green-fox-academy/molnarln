package sharpie;

public class inkUsage {
    public static void main(String[] args) {
        Sharpie first = new Sharpie("blue", 34);
        Sharpie second = new Sharpie("red", 34);
        Sharpie third = new Sharpie("green", 34);
        Sharpie fourth = new Sharpie("black", 34);
        Sharpie fifth = new Sharpie("yellow", 34);

        System.out.println(first.color + " " + first.width + " " + first.inkAmount);

        for (int i = 0; i <100 ; i++) {

            first.use();
        }

        System.out.println(first.color + " " + first.width + " " + first.inkAmount);

        SharpieSet setOfSharpies = new SharpieSet();


        setOfSharpies.add(first);
        setOfSharpies.add(second);
        setOfSharpies.add(third);
        setOfSharpies.add(fourth);
        setOfSharpies.add(fifth);

        System.out.println("\n"+"Set of sharpies before removeTrash: ");
        System.out.println("Usable sharpies: " + setOfSharpies.countUsable());


        for (Sharpie sharpie: setOfSharpies.sharpies
             ) {
            System.out.println(sharpie.color + " " + sharpie.inkAmount);
        }
        setOfSharpies.removeTrash();

        System.out.println("\n"+"Set of sharpies after removeTrash: ");
        for (Sharpie sharpie: setOfSharpies.sharpies
        ) {
            System.out.println(sharpie.color + " " + sharpie.inkAmount);
        }

        System.out.println("Usable sharpies: " + setOfSharpies.countUsable());

    }
}
