public class Reverse {
    public static void main(String[] args) {
        // - Create an array variable named `aj`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Reverse the order of the elements in `aj`
        // - Print the elements of the reversed `aj`

        int[] aj = {3,4,5,6,7};
        int[] temp = new int[5];

        for (int i = 0; i < 5 ; i++) {

            temp[i]=aj[(i-4)*(-1)];
        }
        aj = temp;
        for (int item : aj
                ) {
            System.out.print(item + " ");
        };
    }
}
