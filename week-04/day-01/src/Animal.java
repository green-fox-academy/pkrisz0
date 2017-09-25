public class Animal {
    String name;
    int hunger = 50;
    int thirst = 50;

    public static void main(String[]args){

        Animal cat = new Animal("Bubi");

        cat.play();
        System.out.println("After playing, " + cat.name + " is this thirsty: " + cat.thirst);

        cat.eat();
        cat.eat();
        cat.eat();

        System.out.println("After eating 3 whole meals, " + cat.name + " is this hungry: " + cat.hunger);
    }


public Animal (String name) {
        this.name = name;
        this.hunger = hunger;
        this.thirst = thirst;
        }

public void eat() {
        this.hunger -= 1;
        }

public void drink() {
        this.thirst =- 1;
        }

public void play () {
        this.hunger += 1;
        this.thirst += 1;
        }

}