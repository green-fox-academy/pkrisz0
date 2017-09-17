import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {

        System.out.println("Enter a number");
        Scanner userInput1 = new Scanner(System.in);
        int count = userInput1.nextInt();

        int sum = 0;

        for (int i = 0; i < count; i++) {
            System.out.println("Add number " + (i + 1));
            Scanner userInput = new Scanner(System.in);
            int nextnumber = userInput.nextInt();

            int dummy = nextnumber;

            sum += dummy;
        }

        double avg = sum / count;

        System.out.println("The average of entered numbers is: " + (avg));
    }
}


// Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4