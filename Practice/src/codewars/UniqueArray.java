package codewars;

import java.util.Arrays;

public class UniqueArray {

    public static void main(String[] args) {

    }

    public static int[] unique(int[] integers) {

        return Arrays.stream(integers).distinct().toArray();
    }

}
