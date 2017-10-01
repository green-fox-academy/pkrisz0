import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {
    public static void main(String[] args) {

        System.out.println("Add the range (min followed by max) you wanna play the guessing game in:");
        Scanner userInput1 = new Scanner(System.in);
        int min = userInput1.nextInt();
        int max = userInput1.nextInt();

        numberGenerator(min, max);

        int thenumber = numberGenerator(min, max);

        System.out.println("Guess the number, punk! You get 5 tries.");

        theGame(0, thenumber);
    }


    public static int numberGenerator(int min, int max) {
        Random rand = new Random();
        int thenumber = rand.nextInt((max - min) + min);
        return thenumber;
    }

    public static void theGame(int guess, int thenumber) {

        int lives = 5;

        while( lives > 0) {

            while (thenumber != guess) {
                lives--;

                Scanner userInput1 = new Scanner(System.in);
                guess = userInput1.nextInt();

                if(lives == 0){
                    System.out.println("Game over!");
                } else if (guess == thenumber) {
                    System.out.println("Congratulations. You won!");
                } else if (guess < thenumber) {
                    System.out.println("Too low. Guess again! You have " + lives + " lives left." );
                } else if (guess > thenumber && lives >= 1) {
                    System.out.println("Too high. Guess again! You have " + lives + " lives left");
                }
            }
        }
    }
}


// Write a program where the program chooses a number between 1 and 100. The player is then asked to enter a guess.
// If the player guesses wrong, then the program gives feedback and ask to enter an other guess until the guess is correct.

