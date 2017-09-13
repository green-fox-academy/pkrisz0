import java.util.ArrayList;
import java.util.Arrays;

public class QuoteSawp {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

        String dummy = list.get(2);
        list.set(2, list.get(5));
        list.set(5, dummy);

        //print it #1

        String nicerlist = Arrays.toString(list.toArray()).replace("[", "").replace("]", "").replace(",","");

        System.out.println(nicerlist);

        //or print like this and keep the relevant comma

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

    }
}

// Accidentally I messed up this quote from Richard Feynman.
// Two words are out of place
// Your task is to fix it by swapping the right words with code

// Also, print the sentence to the output with spaces in between.

// correct quote: What I cannot create, I do not understand.

