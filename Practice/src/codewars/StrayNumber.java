package codewars;

import java.util.Arrays;

public class StrayNumber {
    public static void main(String[] args) {
        int[] input = {2,2,2,3,2,2};
        System.out.println(stray(input));
    }

    static int stray(int[] numbers) {
        Arrays.sort(numbers);
        if (numbers[0] == numbers[1]){
            return numbers[numbers.length-1];
        }
        return numbers[0];
    }
}
