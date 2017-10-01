import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {       
        
        System.out.println("Please enter a random number:");
        Scanner userInput = new Scanner(System.in);
        int number = userInput.nextInt();

        if (number % 2 == 0) {
            System.out.println("You have entered and even number!");
        } else {
            System.out.println("You have entered an odd number!");
        }
   }
}

// Write a program that reads a number form the standard input,
// Than prints "Odd" if the number is odd, or "Even" it it is even.

