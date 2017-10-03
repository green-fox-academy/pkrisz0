import java.util.Arrays;
import java.util.List;

public class InvertArrayElements {
    public static void main(String[] args) {
        int[] array = {1, 5, 7, 8, 9};

        invert(array);

    }
    public static int[] invert(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] *= -1;
        }
        return array;
    }
}
