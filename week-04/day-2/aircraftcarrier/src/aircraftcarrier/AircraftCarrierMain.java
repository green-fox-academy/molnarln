package aircraftcarrier;

public class AircraftCarrierMain {
    public static void main(String[] args) {
        F16 firstF16 = new F16();
        F16 secondF16 = new F16();
        F35 firstF35 = new F35();
        F35 secondF35 = new F35();

        Carrier carrier1 = new Carrier(14, 500);

        carrier1.add(firstF16);
        carrier1.add(secondF16);
        carrier1.add(firstF35);
        carrier1.add(secondF35);

        carrier1.fill();
        System.out.println(firstF35.ammoStore);
        System.out.println(firstF16.ammoStore);
        System.out.println(secondF35.ammoStore);







    }
}
