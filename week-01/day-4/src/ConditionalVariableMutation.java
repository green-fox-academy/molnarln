import java.util.Scanner;

public class ConditionalVariableMutation {
    public static void main(String[] args) {
        double a = 24;
        int out = 0;
        // if a is even increment out by one
        if ( a % 2 == 0){
            out += 1;
        }


        System.out.println(out);




        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number!");
        int b = scanner.nextInt();

        String out2 = "";
        // if b is between 10 and 20 set out2 to "Sweet!"
        // if less than 10 set out2 to "Less!",
        // if more than 20 set out2 to "More!"

        if ( b >= 10 && b <= 20){
            out2 = "Sweet!";

        } else  if ( b < 10){
            out2 = "Less!";

        } else {
            System.out.println("More!");

        }
        System.out.println(out2);



        int c = 123;
        int credits = 49;
        boolean isBonus = false;
        // if credits are at least 50,
        // and isBonus is false decrement c by 2
        // if credits are smaller than 50,
        // and isBonus is false decrement c by 1
        // if isBonus is true c should remain the same

        if (credits >= 50 && isBonus == false){
            c -= 2;

        }else if (credits < 50 && isBonus == false){
            c -= 1;
        }



        System.out.println(c);




        int d = 8;
        int time = 150;
        String out3 = "";
        // if d is dividable by 4
        // and time is not more than 200
        // set out3 to "check"
        // if time is more than 200
        // set out3 to "Time out"
        // otherwise set out3 to "Run Forest Run!"

        if (d % 4 == 0 && time <= 200){
            out3 = "check";
        }else if (time > 200){
            out3 = "Time out";
        }else   {
            out3 = "Run Forest Run!";
        }


        System.out.println(out3);
    }
}