public class FleetOfThings {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();
        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch

        Thing milk = new Thing ("Get Milk");
        fleet.add(milk);

        Thing obstacle = new Thing ("Remove the obstacles");
        fleet.add(obstacle);

        Thing stand = new Thing ("Stand up");
        fleet.add(stand);
        stand.complete(true);

        Thing lunch = new Thing ("Eat lunch");
        fleet.add(lunch);
        lunch.complete(true);

        System.out.println(fleet);
    }
}