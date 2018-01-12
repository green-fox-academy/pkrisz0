import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AllExercises {
    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 11, 34, 11, 52, 61, 1, 34));
        ArrayList<String> stringInputList = new ArrayList<>(Arrays.asList("this", "is", "what", "I'm", "searching", "in"));
        System.out.println(uniq(input));
        System.out.println(sorter(input));
        System.out.println(sortIf(input,true));
        System.out.println(sortIf(input,false));
        System.out.println(aStringInAnother("this is what I'm searching in", "searching"));
        System.out.println(aStringInAnother("this is what I'm searching in", "not in it"));
        System.out.println(anIntInAList(input,1));
        System.out.println(anIntInAList(input,9));
        System.out.println(stringInAList(stringInputList,"ching"));
        System.out.println(stringInAList(stringInputList,"not in it"));
    }

    public static ArrayList<Integer> uniq(ArrayList<Integer> input){
        ArrayList<Integer> output = new ArrayList<>();
        for (int i:input) {
            if (!output.contains(i)){
                output.add(i);
            }
        }
        return output;
    }

    public static ArrayList<Integer> sorter(ArrayList<Integer> input){
        Collections.sort(input);
        return input;
    }

    //if true sort descending
    public static ArrayList<Integer> sortIf(ArrayList<Integer> input, boolean order){
        ArrayList<Integer> output = new ArrayList<>();
        if (order){
            Collections.sort(input, Collections.reverseOrder());
            return input;
        }
        return sorter(input);
    }

//    Create a function that takes two strings as a parameter
//    Returns the starting index where the second one is starting in the first one
//    Returns -1 if the second string is not in the first one

    public static int aStringInAnother(String first, String second){
        if (first.contains(second)){
           return first.indexOf(second);
        }
        return -1;
    }

    public static ArrayList<Integer> anIntInAList(ArrayList<Integer> input, int number){
        ArrayList<Integer> output = new ArrayList<>();
        if (input.contains(number)){
            for (int i = 0; i < input.size(); i++) {
                if (String.valueOf(input.get(i)).contains(String.valueOf(number))){
                    output.add(input.get(i));
                }
            }
            return output;
        }
        return output;
    }

//    Create a function that takes a string and a list of string as a parameter
//    Returns the index of the string in the list where the first string is part of
//    Returns -1 if the string is not part any of the strings in the list

    public static int stringInAList (ArrayList<String> stringInputList, String wordToFind){
        for (int i = 0; i < stringInputList.size(); i++) {
            if (stringInputList.get(i).contains(wordToFind)){
                return i;
            }
        }
        return -1;
    }
}
