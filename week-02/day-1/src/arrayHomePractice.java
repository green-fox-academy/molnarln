import java.util.Arrays;
public class arrayHomePractice {
    public static void main(String[] args) {
        int[] randomArray;
        int[] numberArray = new int[10];

        randomArray = new int[20];
        randomArray[1] =2;

        String[] stringArry = {"just", "random", "words"};
        for(int i=0; i< stringArry.length; i++){
            System.out.print("| " + stringArry[i] + " ");
        }
        System.out.println("|");

        int k = 1;
        while (k<41){
            System.out.print("-");
            k++;
        }
        System.out.println();

        for (int i=0; i < numberArray.length; i++){

            numberArray[i] = i;

            System.out.print("| " + numberArray[i] + " ");
        }
        System.out.println("|");


        int l = 1;
        while (l<41){
            System.out.print("-"); l++;
        }
        System.out.println();

        String [][] multiArray = new String[10][10];
        for (int i = 0; i< multiArray.length; i++){

            for (int j = 0; j< multiArray[i].length; j++){

                multiArray[i][j] = i + " " + j;
                System.out.print("| " + multiArray[i][j] + " ");
            }
            System.out.println("|");
        }

        int m = 1;
        while (m<50){
            System.out.print("-"); m++;
        }
        System.out.println();

        for (int row : numberArray){
            System.out.print(row);
        }
        System.out.println("\n");

        for (String[] rows : multiArray){

            for (String column: rows){
                System.out.print("| " + column + " ");
            }
            System.out.println("|");
        }

        int m2 = 1;
        while (m2<50){
            System.out.print("-"); m2++;
        }
        System.out.println();


        int [] numberCopy = Arrays.copyOf(numberArray, 5);
        for (int i = 0; i< numberCopy.length; i++){
            System.out.print(i);
        }
        System.out.println();






    }
}

