public class Reptile extends Animal implements EggBirth{

    public Reptile(String name) {
        super(name);
    }

    @Override
    String greet() {
        return "*suspicious reptile noise*";
    }

    @Override
    public String wantChild() {
        return "wants a child from an egg!";
    }
}
