import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {

        // Write a program that reads a number form the standard input,
        // Than prints "Odd" if the number is odd, or "Even" it it is even.

        System.out.println("Please enter a random number:");
        Scanner number = new Scanner(System.in);
        int userInput = number.nextInt();

        if (userInput % 2 == 0) {
            System.out.println("You have entered and even number!");
        } else {
                System.out.println("You have entered an odd number!");
            }
        }
    }
