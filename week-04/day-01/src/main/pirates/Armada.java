package main.java.pirates;

import java.util.ArrayList;

public class Armada extends ArrayList<Ship> {
    String name;
    Pirates one;
    int initialCapacity;

    public Armada(String name) {
        one = new Pirates();
        this.name = name;
        this.initialCapacity = one.randomGenerator(1,100);
    }

    public void fillArmada(){
        int shipsName = 1;

        for (int i = 0; i < this.initialCapacity; i++) {
            add(new Ship(this.name + " " + String.valueOf(shipsName))); //ships
            shipsName++;
        }
        for (int i = 0; i < this.initialCapacity; i++) {
            this.get(i).fillShip(); //main.java.pirates
        }
    }

    public int totalPirateCount(){
        int TPC = 0;
        for (int i = 0; i < this.initialCapacity; i++) {
            TPC += this.get(i).crewCount;
        }
        return TPC;
    }

    public void armadaStats(){
        System.out.println("The " + this.name + " Armada has " + this.initialCapacity + " ships, with a total of " + this.totalPirateCount() + " Pirates.");
    }

    public boolean armadaWar(Armada other){

        int i = 0;
        int j = 0;

        while(i < this.initialCapacity - 1 && j < other.initialCapacity - 1){
            if (this.get(i).battle(other.get(j))) {
                j++;
            } else if (!(this.get(i).battle(other.get(j)))) {
                i++;
            }
        }

        if (i == this.initialCapacity - 1){
            System.out.println("The " + this.name + " Armada has lost.");
            return false;
        } else if (j == other.initialCapacity - 1) {
            System.out.println("The " + other.name + " Armada has lost.");
            return true;
        }
        return false;
    }
}

