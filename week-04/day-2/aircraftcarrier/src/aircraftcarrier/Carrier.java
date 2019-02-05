package aircraftcarrier;

import javax.sound.midi.Soundbank;
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
        int sumOfNeededAmmos = 0;
        try {
            if (storeOfCarrierAmmo == 0){
                throw new Exception();
            }
        }catch (Exception ex){
            System.out.println("The carrier's ammostore is empty!");
        }
        //Calculate needed ammo:
        for (Aircraft aircraft:aircrafts
             ) {
            if (aircraft.ammoStore < aircraft.maxAmmo){
                sumOfNeededAmmos += aircraft.maxAmmo;
            }
        }
        if (sumOfNeededAmmos < storeOfCarrierAmmo){
            for (Aircraft aircraft:aircrafts
            ) {
                aircraft.refill(storeOfCarrierAmmo);
                storeOfCarrierAmmo -= aircraft.maxAmmo;
            }

        }else if (sumOfNeededAmmos > storeOfCarrierAmmo){
            for (Aircraft aircraft:aircrafts
                 ) {
                if (aircraft.type.equals("F35")){
                    aircraft.refill(aircraft.maxAmmo);
                    storeOfCarrierAmmo -= aircraft.maxAmmo;
                }
            }
            for (Aircraft aircraft:aircrafts
                 ) {
                if (!aircraft.type.equals("F35")){
                    aircraft.refill(aircraft.maxAmmo);
                    storeOfCarrierAmmo -= aircraft.maxAmmo;
                }
            }
        }
    }
}
