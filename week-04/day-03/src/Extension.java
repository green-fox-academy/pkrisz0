import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by aze on 2017.04.04..
 */
public class Extension {
    int add(int a, int b) {
        return a + b;
    }

    int maxOfThree(int a, int b, int c) {
        if (a > b && a > c)
            return a;
        if (b > a && b > c)
            return b;
        else
            return c;
    }

    double median(List<Integer> pool) {
        Collections.sort(pool);
        double median;

        if (pool.size() % 2 == 0) { //paros hossz
            median = (((double) pool.get((pool.size()) / 2) + (double) pool.get(pool.size() / 2 - 1)) / 2);

            //median = ((double)numArray[numArray.length/2] + (double)numArray[numArray.length/2 - 1])/2;

        } else {  //paratlan hossz
            median = (double) pool.get((pool.size() - 1 ) / 2);
        }
        return median;
    }

    boolean isVowel(char c) {
        return Arrays.asList('a', 'u', 'o', 'e', 'i').contains(c);
    }

    String translate(String hungarian) {
        String teve = hungarian;
        int length = teve.length();
        for (int i = 0; i < length; i++) {
            char c = teve.charAt(i);
            if (isVowel(c)) {
                teve = String.join(c + "v" + c, teve.split(""+c));
                i+=2;
                length+=2;
            }
        }
        return teve;
    }
}