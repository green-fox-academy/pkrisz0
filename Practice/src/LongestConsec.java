import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class LongestConsec {

    public static String longestConsec(String[] strarr, int k) {
        // your code
        String output = "";
        int n = strarr.length;

        if (n == 0 || k <= 0 || k > n) {
            return "";
        }

        List<Integer> wordSizes = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            wordSizes.add(strarr[i].length());
        }

        Collections.sort(wordSizes);

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {
                if (strarr[j].length() == wordSizes.get(i)) {
                    output.concat(strarr[j]);
                }
            }
        }
        return output;
    }

    public static void main(String[] args) {
        String[] input = {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"};
        System.out.println(longestConsec(input, 2));
    }
}

    /*
     You are given an array strarr of strings and an integer k. Your task is to return the
     first longest string consisting of k consecutive strings taken in the array.

#Example: longest_consec(["zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"], 2) --> "abigailtheta"

n being the length of the string array, if n = 0 or k > n or k <= 0 return "".

     */