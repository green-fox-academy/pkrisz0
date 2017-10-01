import java.util.ArrayList;
import java.util.List;

public class Carrier {
    List<Aircrafts> shipsOnCarrier;
    int carrierAmmo;
    int carrierHp;


    public Carrier(int carrierAmmo, int carrierHp) {
        this.carrierAmmo = carrierAmmo;
        this.carrierHp = carrierHp;
    }

    public void addAircraft(String whatkindOfPlane){
        this.shipsOnCarrier = new ArrayList<>();
        if (whatkindOfPlane.contains("F16")) {
            f16sStored++; //should this be a list ?
        } else {
            f35sStored++;
        }
    }


}
