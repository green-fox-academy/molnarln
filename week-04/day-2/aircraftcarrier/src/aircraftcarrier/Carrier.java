package aircraftcarrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {

    int storeOfCarrierAmmo;
    int healthPoint;

    List<Aircraft>aircrafts;

    public Carrier (int initialStoreOfAmmo, int initialHealthPoint) {
        aircrafts = new ArrayList<>();
        this.storeOfCarrierAmmo = initialStoreOfAmmo;
        this.healthPoint = initialHealthPoint;

    }

    public void add(Aircraft aircaftToAdd) {
        aircrafts.add(aircaftToAdd);
    }

    public void fill () {
        for (Aircraft aircaft:aircrafts
             ) {
            aircaft.refill(storeOfCarrierAmmo);
            storeOfCarrierAmmo -= aircaft.maxAmmo;
        }

    }


}
