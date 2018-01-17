package codewars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxDiff {

    public static void main(String[] args) {
        System.out.println(maxDiff(new int[]{}));
    }

    public static int maxDiff(int[] lst) {
        List<Integer> helper = new ArrayList<>();

        if (lst.length > 0){
            for (int i = 0; i < lst.length; i++) {
                helper.add(lst[i]);
            }
            Collections.sort(helper);

            return helper.get(helper.size() - 1) - helper.get(0);
        }
        return 0;
    }
}

// return lst.length == 0 ? 0 : Arrays.stream(lst).max().getAsInt() - Arrays.stream(lst).min().getAsInt();
