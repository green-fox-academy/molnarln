package practicerandom;

import java.util.Random;

public class PracticeRandom {
    public static void main(String[] args) {

        double chance = Math.random();

        System.out.println(chance);
        if(chance < (1.0/3.0)){
            System.out.println("the first branch");

        }else if ( ((1.0/3.0)) <= chance && chance < ((2.0/3.0)) ){
            System.out.println("The second branch");

        }else if ( ((2.0/3.0)) <= chance){
            System.out.println("The third branch");

        }else{
            System.out.println("Non of them");
        }
    }
}
