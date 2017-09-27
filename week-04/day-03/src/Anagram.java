public class Anagram {
    String one;
    String two;

    public Anagram(String one, String two) {
        this.one = one;
        this.two = two;
    }

    public boolean anagramChecker() {
        String reverse = "";
        for (int i = one.length() - 1; i >= 0; i--) {
            reverse += String.valueOf(one.charAt(i));
        }
        if (reverse.equals(two)) {
            return true;
        }
        else {
            return false;
        }
    }
}
