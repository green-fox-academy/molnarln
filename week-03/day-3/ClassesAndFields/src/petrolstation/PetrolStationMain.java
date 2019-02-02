package petrolstation;

public class PetrolStationMain {
    public static void main(String[] args) {
        Station station1 = new Station();
        station1.gasAmount = 500;

        Car car1 = new Car ();

        System.out.println("Petrolstation gas amount before refill: " + station1.gasAmount + " Car gas amount before refill: " + car1.gasAmount);

        station1.refill(car1);
        System.out.print("\n");

        System.out.println("Petrolstation gas amount after refill: " + station1.gasAmount + " Car gas amount after refill: " + car1.gasAmount);
    }
}
