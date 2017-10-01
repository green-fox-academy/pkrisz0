import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("Add a number !");
        Scanner userInput1 = new Scanner(System.in);
        int number = userInput1.nextInt();

        int original = number;

        List<Integer> digits = new ArrayList<Integer>();

        while (number > 0) {
            int digit = number % 10;  // Store digit in a variable
            number = number / 10;

            // Add digit to the list
            digits.add(digit);
        }

        //have to raise each to the power of digits.size
        int[] powerlist = new int[digits.size()];

        for (int i = 0; i < digits.size(); i++) {
            int power = (int) Math.pow(digits.get(i), digits.size());
            powerlist[i] = power;
        }

        //add together power list array
        int sum = 0;

        for (int i = 0; i < powerlist.length; i++){
            sum += powerlist[i];
        }

        if (sum == original){
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is NOT an Armstrong number.");
        }

    }
}
