import java.util.HashMap;
import java.util.Map;

public class CountLetters {
    String input;

    public CountLetters(String input) {
        this.input = input;
    }

    public Map mapMaker(String input) {
        HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();

        for (int i = 0; i < input.length(); i++) {
            hmap.put(input.charAt(i), input.length() - input.replaceAll(String.valueOf(input.charAt(i)), "").length());
        }
        return hmap;
    }
    /*
    public static void main(String[] args) {
        CountLetters bambamarha = new CountLetters("bambamarha");
        bambamarha.mapMaker();
    }
    */
}
