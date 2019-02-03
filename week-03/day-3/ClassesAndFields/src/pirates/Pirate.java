package pirates;

public class Pirate {
    int levelOfIntoxication;
    boolean isDead;
    public Pirate(){
        levelOfIntoxication = 0;
    }
    public void drinkSomeRum(){
        if (!isDead){
            levelOfIntoxication ++;
        } else {
            System.out.println("He is dead.");
        }
    }
    public void howItGoingMate(){
        if (0 <= levelOfIntoxication && levelOfIntoxication <= 4 && !isDead){
            System.out.println("Pour me anudder!");
        }else if(levelOfIntoxication > 4 && !isDead) {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
        }else if(isDead){
            System.out.println("He is dead.");
        }
    }

    public void die(){
        isDead = true;
    }
}
