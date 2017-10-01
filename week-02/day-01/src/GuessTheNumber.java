import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        int magicnumber = 6;

        System.out.println("Guess the number I am thinking of!");
        Scanner userInput1 = new Scanner(System.in);
        int guessed = userInput1.nextInt();

        if (guessed < magicnumber){
            System.out.println("The stored number is higher");
        } else if (guessed > magicnumber){
            System.out.println("The stored number is lower");
        } else if (guessed == magicnumber){
            System.out.println("You found the number: " + magicnumber);
        }
    }
}

// Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stried number is lower
// You found the number: 8