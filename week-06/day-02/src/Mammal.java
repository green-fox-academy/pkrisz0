public class Mammal extends Animal {

    public Mammal(String name){
        super(name);
    }

    @Override
    String greet() {
        return "mammal sounds";
    }


    public String wantChild() {
         return "want a child from my uterus!";
    }

}
