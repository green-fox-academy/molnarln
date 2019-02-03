package pirates;

public class BattleApp {
    public static void main(String[] args) {
        Ship ship1 = new Ship();
        Ship ship2 = new Ship();
        Ship ship3 = new Ship();
        Ship ship4 = new Ship();
        Ship ship5 = new Ship();
        ship1.fillShip();
        ship2.fillShip();
        ship3.fillShip();
        ship4.fillShip();
        ship5.fillShip();
        Armada armada1 = new Armada();
        armada1.addToArmada(ship1);
        armada1.addToArmada(ship2);
        armada1.addToArmada(ship3);
        armada1.addToArmada(ship4);
        armada1.addToArmada(ship5);

        Ship shipa = new Ship();
        Ship shipb = new Ship();
        Ship shipc = new Ship();
        Ship shipd = new Ship();
        Ship shipe = new Ship();
        shipa.fillShip();
        shipb.fillShip();
        shipc.fillShip();
        shipd.fillShip();
        shipe.fillShip();
        Armada armada2 = new Armada();
        armada2.addToArmada(shipa);
        armada2.addToArmada(shipb);
        armada2.addToArmada(shipc);
        armada2.addToArmada(shipd);
        armada2.addToArmada(shipe);

        armada1.war(armada2);


        armada1.armada.get(0).getShip();
        armada2.armada.get(0).getShip();

    }
}
