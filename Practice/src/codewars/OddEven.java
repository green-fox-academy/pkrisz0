package codewars;

public class OddEven {
    public static String oddOrEven (int[] array) {
        int sum = 0;
        if (array.length == 0) {
            array[0] = 0;
        }

        for (int i = 0; i < array.length; i++) {
                sum += array[i];
        }

        return sum % 2 == 0 ? "odd" : "even";
    }
}
