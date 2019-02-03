package pirates;

import java.util.ArrayList;
import java.util.List;

public class Ship {
    List<Pirate> ship;

    public Ship (){
        ship = new ArrayList<>();
    }

    public void fillShip(){
        Pirate captain = new Pirate("Captain");
        ship.add(captain);
        for (int i = 0; i < (int) (Math.random() * 30); i++) {
            Pirate crewMember = new Pirate("pirate" + i);
            ship.add(crewMember);
        }

    }

    public void getShip (){
        int counter=0;
        for (Pirate pirate:ship
             ) {
            System.out.println("Name of pirate: " + pirate.name + " Consumed rum: " + pirate.levelOfIntoxication + " State: " + (pirate.isDead ? "dead" : "alive"));
            if (!pirate.isDead){
                counter ++;
            }
        }
        System.out.println("Number of alive pirates: " + counter);

    }

    public boolean battle (Ship shipToBattleWith){
        boolean win = false;
        int scoreThis=0;
        int scoreShipToBattle = 0;
        int alivePiratesOnThis = 0;
        int alivePiratesOnToBattleWith = 0;

        for (Pirate pirate: this.ship
             ) {
            if (!pirate.isDead){
                alivePiratesOnThis ++;
            }
        }
        scoreThis = alivePiratesOnThis - this.ship.get(0).levelOfIntoxication;

        for (Pirate pirate: shipToBattleWith.ship
        ) {
            if (!pirate.isDead){
                alivePiratesOnToBattleWith ++ ;
            }
        }
        scoreShipToBattle = alivePiratesOnToBattleWith - this.ship.get(0).levelOfIntoxication;

        if(scoreThis > scoreShipToBattle){
            for (int i = 0; i < shipToBattleWith.ship.size() * Math.random() ; i++) {
                shipToBattleWith.ship.get(i).die();
            }
            for (Pirate pirate:this.ship
                 ) {
                for (int i = 0; i <(int)(Math.random()*10) ; i++) {
                    pirate.drinkSomeRum();
                }
            }
            return true;

        }else if(scoreShipToBattle > scoreThis) {
            for (int i = 0; i < this.ship.size() * Math.random() ; i++) {
                    this.ship.get(i).die();
            }
            for (Pirate pirate: shipToBattleWith.ship
                 ) {
                for (int i = 0; i < (int)(Math.random()*10) ; i++) {
                    pirate.drinkSomeRum();
                }
            }
        }
        return false;
    }
}
