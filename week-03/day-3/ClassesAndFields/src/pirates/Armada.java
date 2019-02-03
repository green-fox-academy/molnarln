package pirates;

import java.util.ArrayList;
import java.util.List;

public class Armada {
    List<Ship> armada;

    public Armada(){
        armada = new ArrayList<>();
    }

    public void addToArmada(Ship shipToAdd){
        this.armada.add(shipToAdd);
    }

    public void war (Armada anotherArmadaToWarWith){
        for (int i = 0; i < this.armada.size(); i++) {
            for (int j = 0; j <anotherArmadaToWarWith.armada.size(); j++) {
                this.armada.get(i).battle(anotherArmadaToWarWith.armada.get(j));
                if (this.armada.get(i).battle(anotherArmadaToWarWith.armada.get(j)) == true){
                    this.armada.get(i).battle(anotherArmadaToWarWith.armada.get(j+1));

                }
            }
        }
    }
}
