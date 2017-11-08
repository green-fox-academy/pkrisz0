package come.greenfox.pkrisz0.guardians.model;

public class Ship {

    // max 12500
    int caliber25;
    int caliber30;
    int caliber50;
    String shipstatus;
    boolean ready;

    public Ship() {
        this.caliber25 = 0;
        this.caliber30 = 0;
        this.caliber50 = 0;
        this.shipstatus = shipStatus();
        this.ready = readyToGo();
    }

    public void fill(String received, int amount){
         if (received.equals(".50")){
             this.caliber50 += amount;
         } else if (received.equals(".30")){
             this.caliber30 += amount;
         } else {
             this.caliber25 += amount;
         }
    }

    public String shipStatus(){
        int ammo = this.caliber50 + this.caliber30 + this.caliber25;
        int max = 12500;
        String status;
        if (ammo > max){
            status = "overloaded";
        } else if (ammo == max) {
            status = "full";
        } else if (ammo < max && ammo > 0) {
            status = (ammo * 100 / max) + "%";
        } else {
            status = "empty";
        } return status;
    }

    public boolean readyToGo(){
        return shipstatus.equals("full") ? true : false;
    }

    public int getCaliber25() {
        return caliber25;
    }

    public void setCaliber25(int caliber25) {
        this.caliber25 = caliber25;
    }

    public int getCaliber30() {
        return caliber30;
    }

    public void setCaliber30(int caliber30) {
        this.caliber30 = caliber30;
    }

    public int getCaliber50() {
        return caliber50;
    }

    public void setCaliber50(int caliber50) {
        this.caliber50 = caliber50;
    }

    public String getShipstatus() {
        return shipstatus;
    }

    public void setShipstatus(String shipstatus) {
        this.shipstatus = shipstatus;
    }

    public boolean isReady() {
        return ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }
}
