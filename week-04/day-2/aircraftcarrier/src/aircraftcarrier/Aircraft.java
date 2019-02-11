package aircraftcarrier;

public class Aircraft {
    int maxAmmo;
    int baseDamage;
    int ammoStore;
    int allDamage;
    boolean priority;
    String type;

    public Aircraft () {
        this.ammoStore = 0;
        this.allDamage = 0;

    }

    public int fight() {
        int damage = baseDamage * ammoStore;
        allDamage += damage;
        return damage;
    }

    public int refill (int amountOfRefill) {
        int reaminingAmmo = amountOfRefill-maxAmmo;
        if(ammoStore < amountOfRefill){
            ammoStore = maxAmmo;
        }
        ammoStore = amountOfRefill;
        return reaminingAmmo;
    }

    public String getType (){
        return type;
    }

    public String getStatus () {

        String status = "Type " + type + ", Ammo: " + ammoStore + ", Base damage: " + baseDamage + " All damage: " + allDamage;
        return status;
    }

    public boolean isPriority () {

        return this.priority;
    }


}
