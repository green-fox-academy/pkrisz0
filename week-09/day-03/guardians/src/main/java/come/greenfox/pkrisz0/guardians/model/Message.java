package come.greenfox.pkrisz0.guardians.model;

public class Message {

    String received;
    String translated;

    public Message(String rec) {
        this.received = rec;
        this.translated = translate();
    }

    public String translate(){
        return this.translated = "I am Groot!";
    }

    public String getReceived() {
        return received;
    }

    public void setReceived(String received) {
        this.received = received;
    }

    public String getTranslated() {
        return translated;
    }

    public void setTranslated(String translated) {
        this.translated = translated;
    }
}
