package pirates;

public class Pirate {
    int levelOfIntoxication;

    public Pirate(){
        levelOfIntoxication = 0;
    }
    public void drinkSomeRum(){
        levelOfIntoxication ++;
    }
    public void howItGoingMate(){
        if (0 <= levelOfIntoxication && levelOfIntoxication <= 4){
            System.out.println("Pour me anudder!");
        }else {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
        }
    }
}
