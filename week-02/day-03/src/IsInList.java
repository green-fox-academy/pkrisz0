import java.util.ArrayList;
import java.util.Arrays;

public class IsInList {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));

        //solution #1
        ArrayList<Integer> check = new ArrayList<Integer>(Arrays.asList(4, 8, 12, 16));

        if(list.containsAll(check)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

// Check if list contains all of the following elements: 4,8,12,16
// Print "true" if it contains all, otherwise print "false"
// Can you do both the different approaches you tried in the previous one?

