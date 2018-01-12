import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {
    public static void main(String[] args) {
        System.out.println("Add the lower limit you wanna play the guessing game in:");
        Scanner userInput1 = new Scanner(System.in);
        int min = userInput1.nextInt();
        System.out.println("Now the upper limit!");
        int max = userInput1.nextInt();
        int theNumber = numberGenerator(min, max);
        System.out.println("Guess the number, punk! You get 5 tries.");
        theGame( theNumber);
    }

    public static int numberGenerator(int min, int max) {
        Random rand = new Random();
        int theNumber = rand.nextInt((max - min) + min);
        return theNumber;
    }

    public static void theGame(int theNumber) {
        int lives = 5;

        for (int i = lives; i >= 1; i--) {
            int left = i-1;
            Scanner userInput1 = new Scanner(System.in);
            int guess = userInput1.nextInt();
            if (guess == theNumber) {
                System.out.println("Congratulations. You won!");
                break;
            } else if (guess < theNumber) {
                System.out.println("Too low. Guess again! You have " + left  + " lives left" );
            } else if (guess > theNumber && lives >= 1) {
                System.out.println("Too high. Guess again! You have " + left + " lives left");
            }
        }
        System.out.println("so Game over!");
    }
}


// Write a program where the program chooses a number between 1 and 100. The player is then asked to enter a guess.
// If the player guesses wrong, then the program gives feedback and ask to enter an other guess until the guess is correct.

