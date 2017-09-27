import java.util.Arrays;

public class Anagram {

    public Anagram() {
    }

    public boolean anagramChecker(String one, String two) {
        if (one.length() != two.length()) return false;

        char[] c1 = one.toCharArray();
        char[] c2 = two.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        for(int i = 0; i < c1.length; i++) {
            if(c1[i] != c2[i])
            return false;
        }

        return true;

    }
}
