//return shortest word in string1

import java.util.Arrays;

public class YourOrder {
    public static void main(String[] args) {
        System.out.println(Order("is2 Th1s T4est 3a"));
    }

    public static int Order (String words){
        String[] wordsOneByOne = words.split("\\s");
        int[] length = new int[wordsOneByOne.length];

        for (int i = 0; i < wordsOneByOne.length; i++) {
            length[i] = wordsOneByOne[i].length();
        }

        Arrays.sort(length);

        return length[0];
    }
}
