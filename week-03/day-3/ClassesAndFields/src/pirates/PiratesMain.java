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


        System.out.println(jackSparrow.isDead);
        System.out.println(blackBeard.isDead);
        Parrot littleParrot = new Parrot("GreenTail", "green");
        System.out.println(littleParrot.name);
        System.out.println(blackBeard.isDead);
        System.out.println(blackBeard.getIsDead());

        Ship blackPearl = new Ship();

        System.out.println("Battle: >>>>>>>>>>>>>>>>");
        System.out.println("BlackPearl crew before battle: ");
        blackPearl.fillShip();
        blackPearl.getShip();

        Ship arc = new Ship();
        System.out.println("Arc crew before battle: ");
        arc.fillShip();
        arc.getShip();

        blackPearl.battle(arc);
        System.out.println(blackPearl.battle(arc));
        System.out.println("BlackPearl crew after battle: ");
        blackPearl.getShip();
        System.out.println("Arc crew after battle: ");
        arc.getShip();

    }
}
