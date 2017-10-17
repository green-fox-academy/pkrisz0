public class Bird extends Animal implements EggBirth {

    public Bird(String name) {
        super(name);
    }

    @Override
    String greet() {
        return "csip-csip";
    }

    @Override
    public String wantChild() {
        return "wants a child from an egg!";
    }
}
