import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddAvg {
    public static void main(String[] args) {
        System.out.println(oddAverage(Arrays.asList(1,2,3,4,5)));
    }

    public static double oddAverage(List<Integer> input){
        double average = 0;
        ArrayList<Integer> oddnumbers = new ArrayList<>();

        for (int i = 0; i < input.size(); i++) {
            if (input.get(i) % 2 != 0){
                oddnumbers.add(input.get(i));
            }
        }

        for (int i = 0; i < oddnumbers.size(); i++) {
            average += oddnumbers.get(i);
        }

        if (oddnumbers.size() == 0){
            return 0;
        }

        average = average/oddnumbers.size();
        return average;
    }
}


// Create a function called `oddAverage` that takes a list of numbers as parameter
// and returns the average value of the odd numbers in the list
// Create basic unit tests for it with at least 3 different test cases

