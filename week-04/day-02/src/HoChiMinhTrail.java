public class HoChiMinhTrail {
    public static void main(String[] args) {
        //Aircrafts one = new Aircrafts();

        F16 oneF16 = new F16();
        F35 twoF35 = new F35();

        System.out.println(twoF35.getStatus());

        System.out.println(twoF35.refill(50));

        System.out.println(twoF35.getStatus());

    }
}
