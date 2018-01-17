import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Exercise1 {

    public static void main(String[] args) {
        List<List<Integer>> input = new ArrayList<>();
        input.add(new ArrayList<Integer>(Arrays.asList(1,1,1,1)));
        input.add(new ArrayList<Integer>(Arrays.asList(2,2,2,2)));
        input.add(new ArrayList<Integer>(Arrays.asList(3,3,3,3)));
        input.add(new ArrayList<Integer>(Arrays.asList(4,4,4,4)));

        System.out.println(sum(input));
    }

    public static int sum(List<List<Integer>> input){
        int finalSum = 0;
        for (List<Integer> l: input) {
            finalSum += l.stream().mapToInt(i -> i.intValue()).sum();
        }
        return finalSum;
    }
}

//    Create a function that takes a matrix (list of lists) of numbers and sums all the numbers
