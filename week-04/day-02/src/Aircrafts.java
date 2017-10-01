public class Aircrafts {
    int maxAmmo;
    int baseDamage;
    int ammoStore;
    int damage;
    int refillAmount;
    int remainingAmmo;

    public Aircrafts() {
        this.ammoStore = 0;
    }

    public int fight() {
        this.damage = this.baseDamage * this.ammoStore;
        this.ammoStore = 0;
        return this.damage;
    }

    public String refill(int refillAmount){

        this.remainingAmmo = refillAmount - (this.maxAmmo - this.ammoStore);

        this.ammoStore += (this.maxAmmo - this.ammoStore);
        return "Remaining ammo after fill: " + this.remainingAmmo;
    }

    public String getType() {
        if (this instanceof F35) {
            return "Type: F35";
        } else {
            return "Type: F16";
        }
    }

    public String getStatus() {
       return this.getType() + " Ammo: " + + this.ammoStore + ", Base Damage: " + this.baseDamage + ", All Damage: " + this.fight();
    }
}
