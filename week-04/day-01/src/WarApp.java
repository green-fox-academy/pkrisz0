public class WarApp {
    public static void main(String[] args) {
        Armada spanish = new Armada("Spanish");
        spanish.fillArmada();
        spanish.armadaStats();

        Armada dutch = new Armada("Dutch");
        dutch.fillArmada();
        dutch.armadaStats();

        dutch.armadaWar(spanish);
    }
}
