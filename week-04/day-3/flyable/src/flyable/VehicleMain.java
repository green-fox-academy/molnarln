package flyable;

public class VehicleMain {

    public static void main(String[] args) {
        Vehicle copter1 = new Helicopter("Heli", 0, "Airbus");

        ((Helicopter) copter1).fly();

        Flyable copter2 = new Helicopter("Heli2", 0, "Lufthansa");
    }
}
