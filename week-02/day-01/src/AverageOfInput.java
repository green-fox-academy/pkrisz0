import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        System.out.println("Please enter five random numbers!");
        int sum = 0;

        for (int i = 1; i < 6; i++) {
            System.out.println("Number " + i);
            Scanner userInput = new Scanner(System.in);
            int number = userInput.nextInt();

            sum += number;
        }

        double average = sum / 5;
        System.out.println("Sum: " + sum + "," + " Average: " + average);
    }
}

// Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
//
// Sum: 22, Average: 4.4
