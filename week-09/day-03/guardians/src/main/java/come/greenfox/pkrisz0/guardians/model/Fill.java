package come.greenfox.pkrisz0.guardians.model;

public class Fill {
    String received;
    int amount;
    String shipstatus;
    boolean ready;

    public Fill(String received, int amount, String shipstatus, boolean ready) {
        this.received = received;
        this.amount = amount;
        this.shipstatus = shipstatus;
        this.ready = ready;
    }

    public String getReceived() {
        return received;
    }

    public void setReceived(String received) {
        this.received = received;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
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
