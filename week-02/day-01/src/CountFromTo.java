import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        // Create a program that asks for two numbers
        // If the second number is not bigger than the first one it should print:
        // "The second number should be bigger"
        //
        // If it is bigger it should count from the first number to the second by one
        //
        // example:
        //
        // first number: 3, second number: 6, should print:
        //
        // 3
        // 4
        // 5

        System.out.println("Please enter a random number:");
        Scanner number = new Scanner(System.in);
        int a = number.nextInt();

        System.out.println("And now another one:");
        Scanner numbertwo = new Scanner(System.in);
        int b = numbertwo.nextInt();

        if (a > b) {
            System.out.println("The second number should be bigger!");
        } else {  while (a < b) {
            System.out.println(a);
            a++;
        }
        }
    }
}
