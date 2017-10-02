import java.util.ArrayList;
import java.util.Arrays;

public class NumberConverter {
    ArrayList<String> numbersTo19 = new ArrayList<>(Arrays.asList("one", "two", "three", "four", "five",
            "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen",
            "sixteen", "seventeen", "eighteen", "nineteen"));
    ArrayList<String> numbersFrom20 = new ArrayList<>(Arrays.asList("twenty", "thirty", "forty", "fifty",
            "sixty", "seventy", "eighty", "ninety"));

    StringBuilder output = new StringBuilder();

    public String converter(int input){

        if (input < 20){
            output.append(numbersTo19.get(input - 1));

        } else if ( input > 20  && input < 100) {

            int firstDigit = (input / 10) - 2;
            int secondDigit = (input % 10) - 1;

            output.append(numbersFrom20.get(firstDigit) + " ");
            output.append(numbersTo19.get(secondDigit));

        } else if (input > 101 ) {

            int firstDigit = (input % 10) - 1;
            int secondDigit = (input / 10 % 10) - 2;
            int thirdDigit = (input / 100) - 1;


            output.append(numbersTo19.get(thirdDigit) + " " + "hundred and ");
            output.append(numbersFrom20.get(firstDigit) + " ");
            output.append(numbersTo19.get(secondDigit));
        }
        return String.valueOf(output);
        }

    public static void main(String[] args) {
        NumberConverter two = new NumberConverter();
        two.converter(146);
    }
}


