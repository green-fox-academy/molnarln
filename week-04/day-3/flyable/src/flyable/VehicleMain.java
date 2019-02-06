package flyable;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle copter1 = new Helicopter("Heli", 0, "Airbus");

        ((Helicopter) copter1).fly();
    }
}
