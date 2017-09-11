import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it

        System.out.println("Please add the distance in kilometers without decimals: ");
        Scanner kilometers = new Scanner(System.in);
        int userInput2 = kilometers.nextInt();

        double miles = userInput2 * 0.621371192;

        System.out.println("The distance in miles is: " + miles);
    }
}
