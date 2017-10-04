public class BattleApp {
    public static void main(String[] args) {

        Pirates orlando = new Pirates();
        Pirates keira = new Pirates();

        System.out.println(orlando.howsItGoingMate());
        orlando.brawl(keira);

        Ship blackPearl = new Ship("Black Pearl");
        blackPearl.fillShip();
        blackPearl.introduce();

        Ship jerryBruckheimer = new Ship("Jerry Bruckheimer");
        jerryBruckheimer.fillShip();
        jerryBruckheimer.introduce();

        blackPearl.battle(jerryBruckheimer);
    }


}

//    an orange with blue text: "Idea 1"
//    a pink with black text: "Awesome"
//    a yellow with green text: "Superb!"