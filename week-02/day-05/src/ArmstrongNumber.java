import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("Add a number !");
        Scanner userInput1 = new Scanner(System.in);
        int number = userInput1.nextInt();

        List<Integer> digits = new ArrayList<Integer>();

        while (number > 0) {
            int digit = number % 10;  // Store digit in a variable
            number = number/10;

            // Add digit to the list
            digits.add(digit);
        }



    }
}

// raise each digit to the third power, and add
//Answer temp = new Answer();
//do whatever initialization you need here
//answers.add(temp);