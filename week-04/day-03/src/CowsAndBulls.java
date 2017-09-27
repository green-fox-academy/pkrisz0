import java.util.Arrays;
import java.util.Scanner;
public class CowsAndBulls {

    String theNumber = "1756"; //for now
    boolean status; //playing or finished
    int guess;

    public CowsAndBulls() {

    }

    /*
    //number generator method
    public int theNumberMaker() {
        this.theNumber = (int)(Math.random() * ((10000 - 999) + 1) + 999);
        System.out.println(this.theNumber);
        return this.theNumber;
    }
    */

    //take user guess
    public String guess() {
        System.out.println("Take a guess!");
        Scanner userInput = new Scanner(System.in);
        String guessed = userInput.nextLine();
        this.guess++;
        return guessed;
    }

    //digit breaker
    public String[] digitBreaker(String input) {
        String[] digits = input.split("");
        return digits;
    }


    //compare guessed and theNumber
    public String compare(){
        for (int i = 0; i < 5; i++) {
            if (digitBreaker(guess())[i] == digitBreaker(theNumber)[i]){
                digitBreaker(guess())[i] = "C";
            } else if (digitBreaker(guess())[i] == digitBreaker(theNumber)[i + 1] || digitBreaker(guess())[i] == digitBreaker(theNumber)[i + 2] || digitBreaker(guess())[i] == digitBreaker(theNumber)[i + 3]) {
                digitBreaker(guess())[i] = "B";
            }
        }
        String output = Arrays.toString(digitBreaker(guess()));
        return output;
    }

    //digitBreaker(guess()).contains(digitBreaker(theNumber)[i]
    //the guessed digit is in the numbers array


    public static void main(String[] args) {
        CowsAndBulls gameOne = new CowsAndBulls();
        System.out.println("I am thinking of a 4-digit number!");
        gameOne.guess();
        System.out.println(gameOne.compare());
    }
}

/*
Create a class what is capable of playing exactly one game of Cows and Bulls (CAB).
The player have to guess a 4 digit number. For every digit that the player guessed correctly in the correct place,
they have a “cow”. For every digit the player guessed correctly in the wrong place is a “bull.”

The CAB object should have a random 4 digit number, which is the goal to guess.
The CAB object should have a state where the game state is stored (playing, finished).
The CAB object should have a counter where it counts the guesses.
The CAB object should have a guess method, which returns a string of the guess result

All methods, including constructor should be tested
*/