package codewars;

import java.util.ArrayList;
import java.util.List;

public class findStringInArray {

    static String[] findWord(String x, String[] y){
        List<String> result = new ArrayList<>();
        int k = 0;
        for (int i = 0; i < y.length; i++) {
            if (y[i].toLowerCase().contains(x.toLowerCase())){
                result.add(y[i]);
                k++;
            }
        }
        String[] Result = new String[result.size()-1];

        for (int i = 0; i < Result.length; i++) {
            Result[i] = result.get(i);
        }
        return Result;
    }

    public static void main(String[] args) {
        String[] y  = { "home", "milk", "Mercury", "fish"};
        findWord("me", y);
    }
}
