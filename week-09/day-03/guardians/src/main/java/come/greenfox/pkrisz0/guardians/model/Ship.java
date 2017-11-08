package come.greenfox.pkrisz0.guardians.model;

public class Ship {

    int caliber25;
    int caliber30;
    int caliber50;
    String shipstatus;
    boolean ready;

    public Ship() {
        this.caliber25 = 0;
        this.caliber30 = 0;
        this.caliber50 = 0;
        this.shipstatus = "empty";
        this.ready = false;
    }

    public void fill(String received, int amount){
         if (received.equals(".50")){
             this.caliber50 += amount;
         } else if (received.equals(".30")){
             this.caliber30 += amount;
         } else {
             this.caliber25 += amount;
         }

         updateStatus();
         this.ready = readyToGo();
    }

    private void updateStatus(){
        int ammo = this.caliber50 + this.caliber25 + this.caliber30;
        int max = 12500;
        if (ammo > max){
            this.shipstatus = "overloaded";
        } else if (ammo == max) {
            this.shipstatus = "full";
        } else if (ammo < max && ammo > 0) {
            this.shipstatus = (ammo * 100 / max) + "%";
        } else {
            this.shipstatus = "empty";
        }
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
