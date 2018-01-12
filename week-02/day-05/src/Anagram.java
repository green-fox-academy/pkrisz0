import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(anagram("god", "dog"));
        System.out.println(anagram("god", "garden"));

    }

    public static boolean anagram(String inputone, String inputtwo) {

        if (inputone.length() != inputtwo.length()) return false;

        char[] c1 = inputone.toCharArray();
        char[] c2 = inputtwo.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        for(int i = 0; i < c1.length; i++) {
            if(c1[i] != c2[i]) return false;
        }

        return true;
    }
}
