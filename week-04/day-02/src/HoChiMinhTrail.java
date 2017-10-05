public class HoChiMinhTrail {
    public static void main(String[] args) {

        Carrier holyCrap = new Carrier("Holy Crap", 500, 4000);
        Carrier georgie = new Carrier("George W.", 500, 4000);

        holyCrap.addAircraft("F16");
        holyCrap.addAircraft("F16");
        holyCrap.addAircraft("F16");
        holyCrap.addAircraft("F16");
        holyCrap.addAircraft("F16");
        holyCrap.addAircraft("F16");

        holyCrap.fillAircrafts();
        holyCrap.status();

        georgie.addAircraft("F35");
        georgie.addAircraft("F35");
        georgie.addAircraft("F35");
        georgie.addAircraft("F35");
        georgie.addAircraft("F35");
        georgie.addAircraft("F35");

        georgie.fillAircrafts();
        georgie.status();

        georgie.fight(holyCrap);
        georgie.status();
        holyCrap.status();
    }
}
