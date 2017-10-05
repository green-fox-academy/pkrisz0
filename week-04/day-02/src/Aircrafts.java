public class Aircrafts {
    int maxAmmo;
    int baseDamage;
    int ammoStore;
    int damage;
    int remainingAmmo;

    public Aircrafts() {
        this.ammoStore = 0;
    }

    public int fight() {
        this.damage = this.baseDamage * this.ammoStore;
        this.ammoStore = 0;
        return this.damage;
    }

    public int refill(int refillAmount){
        this.remainingAmmo = (refillAmount - (this.maxAmmo - this.ammoStore));
        System.out.println(this.getType() + " aircraft has been refilled with " + (this.maxAmmo - this.ammoStore) + " units of ammo.");
        this.ammoStore += (this.maxAmmo - this.ammoStore);
        return this.remainingAmmo;
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
