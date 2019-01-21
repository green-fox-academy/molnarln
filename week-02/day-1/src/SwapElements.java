public class SwapElements {
    public static void main(String[] args) {
        // - Create an array variable named `abc`
        //   with the following content: `["first", "second", "third"]`
        // - Swap the first and the third element of `abc`

        String[] abc = {"first", "second", "third"};

        String[] temp = new String[3];

        temp[0]=abc[2];
        temp[1]=abc[1];
        temp[2]=abc[0];

        abc=temp;

        for (String item:abc
             ) {
            System.out.print(item + " ");
        }

    }
}
