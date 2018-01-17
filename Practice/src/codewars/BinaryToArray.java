package codewars;

import java.util.List;

public class BinaryToArray {

//8,4,2,1

        public static int ConvertBinaryArrayToInt(List<Integer> binary) {
            int sum = 0;
            sum = binary.get(0) == 1 ?  sum + 8 : sum;
            sum = binary.get(1) == 1 ?  sum + 4 : sum;
            sum = binary.get(2) == 1 ?  sum + 2 : sum;
            sum = binary.get(3) == 1 ?  sum + 1 : sum;
            return sum;
        }

}
