package jpmorgan;

public class CreditCard implements CreditCardy {
    String name;
    int cc;

    public CreditCard(String name) {
        this.name = name;
        cc =
    }

    @Override
    public int getSumCVV() {
        return 0;
    }

    @Override
    public String getNameCardholder() {
        return this.name;
    }

    @Override
    public String getCodeAccount() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 16; i++) {
            int k = (int) (Math.random() * 10);
            sb.append(k);
        }
        return sb.toString();
    }

    @Override
    public int cumeSumCVV(String codeAccount) {
        return 0;
    }
}
