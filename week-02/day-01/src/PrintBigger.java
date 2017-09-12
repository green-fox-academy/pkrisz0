import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {

        int one, two;

        System.out.println("Please enter two numbers, and I will print the bigger one!(Press enter after each)");
        Scanner userInputOne = new Scanner(System.in);
        one = userInputOne.nextInt();

        Scanner userInputTwo = new Scanner(System.in);
        two = userInputTwo.nextInt();

        if (one > two) {
            System.out.println(one + " was bigger");
        } else {
            System.out.println(two + " was bigger");
        }
    }
}

// Write a program that asks for two numbers and prints the bigger one
