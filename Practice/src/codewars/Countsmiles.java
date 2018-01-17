package codewars;

import java.util.List;

public class Countsmiles {

    public static void main(String[] args) {

    }

    public static int countSmileys(List<String> arr) {
        return (int) arr.stream().filter(s -> s.matches("[:;][-~]?[)D]")).count();
    }
}
