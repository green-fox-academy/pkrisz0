import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {

        System.out.println("How many chickens does the farmer have? ");
        Scanner userInput1 = new Scanner(System.in);
        int chicken = userInput1.nextInt();

        System.out.println("How many pigs does the farmer have? ");
        Scanner userInput2 = new Scanner(System.in);
        int pigs = userInput2.nextInt();

        int legs = pigs * 4 + chicken * 2;

        System.out.println("These animals have a total of " + legs + " legs.");
    }
}

// Write a program that asks for two integers
// The first represents the number of chickens the farmer has
// The seconf represents the number of pigs the farmer has
// It should print how many legs all the animals have
