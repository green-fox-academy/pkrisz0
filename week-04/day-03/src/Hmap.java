import java.util.Collections;
import java.util.HashMap;

public class Hmap {
    public static void main(String[] args) {

        String theNumber = "1656";

        HashMap<Character, Integer> theNumberMap = new HashMap<Character, Integer>();

        for (int i = 0; i < theNumber.length(); i++) {
            theNumberMap.put(theNumber.charAt(i), theNumber.length() - theNumber.replaceAll(String.valueOf(theNumber.charAt(i)), "").length());
        }

        System.out.println(Collections.singletonList(theNumberMap));
    }
}
