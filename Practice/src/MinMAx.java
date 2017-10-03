import java.util.Arrays;


public class MinMAx {
    public static void main(String[] args) {

        int[] array = {602,457,96578,1,9};
        minMax(array);
    }

    public static int[] minMax(int[] array){

        Arrays.sort(array);

        int[] minMax = new int[2];

        minMax[0] = array[0];
        minMax[1] = array[array.length-1];

        return minMax;
    }
}
