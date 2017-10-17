abstract public class Animal {
    String name;
    //int age;
    //String gender;

    public Animal(String name) {
        this.name = name;
    }

    abstract String greet();
    //abstract String wantChild();
    public String getName(){
        return this.name;
    }
    //abstract String eat();
    //abstract String poop();

}
