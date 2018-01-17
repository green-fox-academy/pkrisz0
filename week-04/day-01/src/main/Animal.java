package main.java;

public class Animal {
    String name;
    int hunger;
    int thirst;

    public static void main(String[]args){

        Animal cat = new Animal("Bubi");

        cat.play();
        System.out.println("After playing, " + cat.name + " is this thirsty: " + cat.thirst);

        cat.eat();
        cat.eat();
        cat.eat();
        cat.drink();

        System.out.println("After eating 3 whole meals, " + cat.name + " is this hungry: " + cat.hunger);
    }


public Animal (String name) {
        this.name = name;
        this.thirst = 50;
        this.hunger = 50;
        }

public void eat() {
        this.hunger--;
        }

public void drink() {
        this.thirst--;
        }

public void play () {
        this.hunger++;
        this.thirst++;
        }

}