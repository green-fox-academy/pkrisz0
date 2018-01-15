import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise12 {
    public static void main(String[] args) {
        List<List<Integer>> input = new ArrayList<>();
        input.add(new ArrayList<Integer>(Arrays.asList(1,1,1,1)));
        input.add(new ArrayList<Integer>(Arrays.asList(2,2,2,2)));
        input.add(new ArrayList<Integer>(Arrays.asList(3,3,3,3)));
        input.add(new ArrayList<Integer>(Arrays.asList(4,4,4,4)));

        System.out.println(Arrays.toString(exerciseTwelve(input)));
    }

    public static int[] exerciseTwelve(List<List<Integer>> inputList){
        int[] output = new int[inputList.size()];
        int sum = 0;
        for (int i = 0; i < inputList.size(); i++) {
            for (int j = 0; j < inputList.get(i).size(); j++) {
                sum += inputList.get(i).get(j);
            }
            output[i] = sum;
            sum = 0;
        }
        return output;
    }
}

//12.Create a function that takes a matrix (list of lists) of numbers and returns the sum of each rows as an array
