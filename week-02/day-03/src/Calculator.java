import java.util.Scanner;

public class Calculator {
    public static void main(String... args) {

        System.out.println("Please type in the expression:");
        Scanner userInputOne = new Scanner(System.in);
        String operator = userInputOne.next();
        int first = userInputOne.nextInt();
        int second = userInputOne.nextInt();

        if (operator.equals("+")){
            System.out.println(first + second);
        } else if (operator.equals("-")){
            System.out.println(first - second);
        } else if (operator.equals("*")){
            System.out.println(first * second);
        } else if (operator.equals("/")){
            System.out.println(first / second);
        } else if (operator.equals("%")){
            double percent = (first % second);
            System.out.println(percent + " %");
        }

    }
}

// Create a simple calculator application which reads the parameters from the prompt
// and prints the result to the prompt.
// It should support the following operations:
// +, -, *, /, % and it should support two operands.
// The format of the expressions must be: {operation} {operand} {operand}.
// Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

// You can use the Scanner class
// It should work like this:

// Start the program
// It prints: "Please type in the expression:"
// Waits for the user input
// Print the result to the prompt
// Exit

