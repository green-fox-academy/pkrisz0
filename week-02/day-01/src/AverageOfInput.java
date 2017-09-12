import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {

        int one, two, three, four, five;

        System.out.println("Please enter five random numbers!(Press enter after each)");
        Scanner userInputOne = new Scanner(System.in);
        one = userInputOne.nextInt();
        Scanner userInputTwo = new Scanner(System.in);
        two = userInputTwo.nextInt();
        Scanner userInputThree = new Scanner(System.in);
        three = userInputThree.nextInt();
        Scanner userInputFour = new Scanner(System.in);
        four = userInputFour.nextInt();
        Scanner userInputFive = new Scanner(System.in);
        five = userInputFive.nextInt();

        int sum = one + two + three + four + five;

        double average = sum / 5;

        System.out.println("Sum: " + sum + "," + " Average: " + average);
    }
}

// Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
//
// Sum: 22, Average: 4.4
