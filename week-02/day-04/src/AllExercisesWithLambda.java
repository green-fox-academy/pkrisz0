import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AllExercisesWithLambda {

    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 11, 34, 11, 52, 61, 1, 34));
        ArrayList<Integer> inputTwo = new ArrayList<>(Arrays.asList(1, 11, 34, 52, 61));
        ArrayList<String> stringInputList = new ArrayList<>(Arrays.asList("this", "is", "what", "I'm", "searching", "in"));

        System.out.println(uniq(input));
        System.out.println(sort(input));
        System.out.println(sortIf(input, true));
        System.out.println(sortIf(input, false));
        System.out.println(partOfAnInt(inputTwo,1));
        System.out.println(partOfAString(stringInputList,"ching"));
    }

    public static List uniq(ArrayList<Integer> input){
        return input.stream().distinct().collect(Collectors.toList());
    }

    public static List sort(ArrayList<Integer> input){
        return input.stream().sorted().collect(Collectors.toList());
    }

    public static List sortIf(ArrayList<Integer> input, boolean descending){
        if (descending){
            return input.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        }
        return sort(input);
    }

    public static List partOfAnInt(ArrayList<Integer> input, int number){
        List<String> numberString = new ArrayList<>();
        input.forEach(i -> numberString.add(String.valueOf(i)));

        return numberString.stream()
                .filter(n -> n.contains(String.valueOf(number)))
                .map(n -> numberString.indexOf(n))
                .collect(Collectors.toList());
    }

    public static List partOfAString(ArrayList<String> input, String word){
        return input.stream()
                .filter(s -> s.contains(word))
                .map(s -> input.indexOf(s))
                .collect(Collectors.toList());
    }
}
