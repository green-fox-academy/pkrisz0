import java.util.ArrayList;
import java.util.List;

public class Carrier extends ArrayList<Aircrafts> {
    List<Aircrafts> shipsOnCarrier;
    int carrierAmmo;
    int carrierHp;
    String name;

    public Carrier(String name, int carrierAmmo, int carrierHp) {
        this.carrierAmmo = carrierAmmo;
        this.carrierHp = carrierHp;
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

    public int typeNeed(String type){
        int typeNeed35 = 0;
        int typeNeed16 = 0;

        for (int i = 0; i < shipCount(); i++) {
            if (this.shipsOnCarrier.get(i) instanceof F35){
                typeNeed35 += (this.shipsOnCarrier.get(i).maxAmmo - this.shipsOnCarrier.get(i).ammoStore);
            } else {
                typeNeed16 += (this.shipsOnCarrier.get(i).maxAmmo - this.shipsOnCarrier.get(i).ammoStore);
            }
        }

        if (type.equals("F16")) {
            return typeNeed16;
        } return typeNeed35;

    }

    public int fillAircrafts(){
        int ammoBeforeFill = this.carrierAmmo;

        if (this.carrierAmmo >= this.ammoNeedOnCarrier()) {
            this.carrierAmmo -= this.ammoNeedOnCarrier();

            for (int i = 0; i < this.shipCount(); i++) {
                this.shipsOnCarrier.get(i).refill(this.carrierAmmo);
            }
            System.out.println("Carrier " + this.name + " has refilled it\'s " + this.shipCount() + " aircrafts with " + (ammoBeforeFill - this.carrierAmmo) + " units of ammo, has " + this.carrierAmmo + " units of ammo left.");

        } else if (this.carrierAmmo < this.ammoNeedOnCarrier() && this.carrierAmmo != 0) {

            //as long as f35 is thirsty, refill them
            while (this.typeNeed("F35") > 0 && this.carrierAmmo > 12) {
                for (int i = 0; i < this.shipCount(); i++) {
                    if (this.shipsOnCarrier.get(i) instanceof F35 && this.carrierAmmo > 12) {
                        this.carrierAmmo -= (this.shipsOnCarrier.get(i).maxAmmo - this.shipsOnCarrier.get(i).ammoStore);
                        this.shipsOnCarrier.get(i).refill(this.carrierAmmo);
                    }
                }
            }

            //after refill F16
            int f16fill = 0;
            for (int i = 0; i < this.shipCount(); i++) {
                if (this.shipsOnCarrier.get(i) instanceof F16 && this.carrierAmmo > 8) {
                    this.carrierAmmo -= (this.shipsOnCarrier.get(i).maxAmmo - this.shipsOnCarrier.get(i).ammoStore);
                    f16fill += (this.shipsOnCarrier.get(i).maxAmmo - this.shipsOnCarrier.get(i).ammoStore);
                    this.shipsOnCarrier.get(i).refill(this.carrierAmmo);
                }
            }

        } if (this.carrierAmmo == 0){
            System.out.println("Not enough ammo on carrier for refill.");
        }

        return carrierAmmo;
    }

    public void fillCarrier(int ammo){
        this.carrierAmmo += ammo;
    }

    public int firePower(){
        int firePower = 0;
        for (int i = 0; i < this.shipCount(); i++) {
            firePower += (this.shipsOnCarrier.get(i).ammoStore * this.shipsOnCarrier.get(i).baseDamage);
        }
        return firePower;
    }

    public void warDamage(Carrier other){
        other.carrierHp -= this.firePower();
        this.carrierHp -= other.firePower();
        this.carrierAmmo = 0;
        other.carrierAmmo = 0;

        for (int i = 0; i < this.shipCount(); i++) {
            this.shipsOnCarrier.get(i).ammoStore = 0;
        }
        for (int i = 0; i < this.shipCount(); i++) {
            other.shipsOnCarrier.get(i).ammoStore = 0;
        }
    }

    public void fight(Carrier other){
        if (other.carrierHp - this.firePower() > this.carrierHp - other.firePower()){
            this.warDamage(other);
            System.out.println(this.name + " won the fight.");
        } else {
            this.warDamage(other);
            System.out.println(other.name + " won the fight.");
        }
    }

    public void status(){
        System.out.println(this.name + " HP: " + this.carrierHp + ", Ammo Storage: " + this.carrierAmmo + ", Total Damage: " + this.firePower());
        for (int i = 0; i < this.shipCount() - 1; i++) {
            System.out.println("Type " + this.shipsOnCarrier.get(i).getType() + ", Ammo: " + this.shipsOnCarrier.get(i).ammoStore + ", Base Damage "
                    + this.shipsOnCarrier.get(i).baseDamage + ", All Damage: " + (this.shipsOnCarrier.get(i).baseDamage
                    + this.shipsOnCarrier.get(i).ammoStore)+ ".");
        }
    }
}

