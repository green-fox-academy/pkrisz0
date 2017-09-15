import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {
    public static void main(String[] args) {

        int thenumber = numberGenerator();

        System.out.println("Guess the number, punk!");

        theGame(0, thenumber);
    }


    public static int numberGenerator() {
        Random rand = new Random();
        int thenumber = rand.nextInt((100 - 1) + 1);
        return thenumber;
    }

    public static void theGame(int guess, int thenumber) {
        while (thenumber != guess) {

            Scanner userInput1 = new Scanner(System.in);
            guess = userInput1.nextInt();

            if (guess == thenumber) {
                System.out.println("Congratulations. You won!");
            } else if (guess < thenumber) {
                System.out.println("Too low. Guess again!");
            } else if (guess > thenumber) {
                System.out.println("Too high. Guess again!");
            }
        }
    }
}


// Write a program where the program chooses a number between 1 and 100. The player is then asked to enter a guess.
// If the player guesses wrong, then the program gives feedback and ask to enter an other guess until the guess is correct.

