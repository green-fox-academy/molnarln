package pirates;

public class PiratesMain {
    public static void main(String[] args) {
        Pirate jackSparrow = new Pirate();
        Pirate blackBeard = new Pirate();

        blackBeard.drinkSomeRum();
        jackSparrow.drinkSomeRum();
        jackSparrow.drinkSomeRum();
        jackSparrow.drinkSomeRum();
        jackSparrow.drinkSomeRum();
        jackSparrow.drinkSomeRum();

        /*blackBeard.die();*/

        jackSparrow.brawl(blackBeard);


        System.out.println(jackSparrow.getIsDead());
        System.out.println(blackBeard.getIsDead());







    }
}
