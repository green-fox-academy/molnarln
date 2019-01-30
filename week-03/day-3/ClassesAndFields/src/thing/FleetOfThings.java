package thing;

public class FleetOfThings {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();
        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch

        Thing first = new Thing("Get milk");
        fleet.add(first);

        Thing second = new Thing("Remove the obstacles");
        fleet.add(second);

        Thing third = new Thing("Stand up");
        third.complete();
        fleet.add(third);

        Thing fourth = new Thing("Eat lunch");
        fourth.complete();
        fleet.add(fourth);

        System.out.println(fleet);
    }
}