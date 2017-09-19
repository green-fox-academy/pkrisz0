import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        System.out.println("Add the number you want to divide 10 with");
        Scanner input = new Scanner(System.in);
        division(input.nextInt());


    }

    public static void division(int divisor){

        try {
            int result = 10 / divisor;
            System.out.println("10 vidided by " + divisor + " equals " + result + ".");
        } catch (ArithmeticException e){
            System.out.println("Can't divide by zero!");
        }
    }
}

// create a function that takes a number
// divides ten with it,
// and prints the result.
// it should print "fail" if the parameter is 0

