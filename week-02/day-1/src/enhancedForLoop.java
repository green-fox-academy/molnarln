
public class enhancedForLoop {
    public static void main(String args[]) {
        // illustration with int array
        int marks[] = { 40, 50, 60, 70, 80 };

        System.out.print("Printing int array with taditional for loop: ");
        for(int i = 0 ; i < marks.length; i++)
        {
            System.out.print(marks[i] + "  ");
        }

        System.out.print("\nPrinting int array with enhanced for loop: ");
        for(int k : marks)
        {
            System.out.print(k + "  " );
        }
        // illustration with string array
        String names[] = { "S N Rao", "Sumathi", "Sridhar", "Jyothi", "Jyostna" };

        System.out.print("\n\nPrinting string array with taditional for loop: ");
        for(int i = 0 ; i < names.length; i++)
        {
            System.out.print(names[i] + "  ");
        }

        System.out.print("Printing string array with enhanced for loop: ");
        for(String str : names)
        {
            System.out.print(str + "  " );
        }
    }
}