import java.lang.reflect.Array;

public class MeanConcatenate4 {

    public static Object[] mean(char[] lst) {

        Object[] output = new Object[2];

        int[] numbers = new int[10];

        int index = 0;
        String characters = "";

        for (int i = 0; i < lst.length; i++) {
            if (Character.isDigit(lst[i])) {
                numbers[index] = lst[i];
                index++;
            } else {
                characters.concat(String.valueOf(lst[i]));
            }
        }

        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }

        double mean = sum / numbers.length;

        output[0] = mean;
        output[1] = characters;

        return output;
    }
}
