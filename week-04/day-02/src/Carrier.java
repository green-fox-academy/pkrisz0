import java.util.ArrayList;
import java.util.List;

public class Carrier extends ArrayList<Aircrafts> {
    List<Aircrafts> shipsOnCarrier;
    int carrierAmmo;
    int carrierHp;
    String name;


    public Carrier(String name) {
        this.carrierAmmo = 500;
        this.carrierHp = 100;
        this.shipsOnCarrier = new ArrayList<>();
        this.name = name;
    }

    public void addAircraft(String type){
        if (type.equals("F16")){
            this.shipsOnCarrier.add(new F16());
            System.out.println("An F16 aircraft has been added to " + this.name + ".");
        } else {
            this.shipsOnCarrier.add(new F35());
            System.out.println("An F35 aircraft has been added to " + this.name + ".");
        }
    }

    public int shipCount(){
        return this.shipsOnCarrier.size();
    }

    public int ammoNeedOnCarrier(){
        int need = 0;
        for (int i = 0; i < shipCount(); i++) {
            need += (this.shipsOnCarrier.get(i).maxAmmo - this.shipsOnCarrier.get(i).ammoStore);
        }
        return need;
    }

    pub

    public int fillAircrafts(){
        int ammoBeforeFill = this.carrierAmmo;

        if (this.carrierAmmo > this.ammoNeedOnCarrier()) {
            this.carrierAmmo -= this.ammoNeedOnCarrier();

            for (int i = 0; i < this.shipCount(); i++) {
                this.shipsOnCarrier.get(i).refill(this.carrierAmmo);
            }
            System.out.println("Carrier " + this.name + " has refilled it\'s " + this.shipCount() + " aircrafts with " + (ammoBeforeFill - this.carrierAmmo) + " units of ammo, has " + this.carrierAmmo + " units of ammo left.");

        } else if (this.carrierAmmo < this.ammoNeedOnCarrier()) {
            this.carrierAmmo -= this.ammoNeedOnCarrier();
            for (int i = 0; i < this.shipCount(); i++) {
                if (this.shipsOnCarrier.get(i) instanceof F35) {
                    this.shipsOnCarrier.get(i).refill(this.carrierAmmo);
                }
            }
        } if (this.carrierAmmo == 0){
            System.out.println("No ammo on carrier.");
        }
        return carrierAmmo;
    }

    public void fillCarrier(int ammo){
        this.carrierAmmo += ammo;
    }
}
