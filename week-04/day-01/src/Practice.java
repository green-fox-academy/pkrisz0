public class Practice {
    public static void main(String[] args) {

        Pirates orlando = new Pirates();
        Pirates keira = new Pirates();

        orlando.drinkSomeRum();
        orlando.drinkSomeRum();

        System.out.println(orlando.howsItGoingMate());

        orlando.brawl(keira);

        Ship blackpearl = new Ship();

        blackpearl.fillShip();
        blackpearl.introduce();
    }


}

//    an orange with blue text: "Idea 1"
//        a pink with black text: "Awesome"
//        a yellow with green text: "Superb!"