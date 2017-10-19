import java.util.Arrays;

public class StringSplit {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(stringSplitter("lovebarbara", 13)));
    }

    public static String[] stringSplitter(String input, int n){
        String[] output = new String[2];
        try {
            output[0] = input.substring(0, n);
            output[1] = input.substring(n,input.length());

        } catch (IndexOutOfBoundsException e) {
            output[0] = "the index you have provided is higher than the number of letters in the string";
            output[1] = e.toString();
        }
        return output;
    }
}

