import java.util.ArrayList;
import java.util.Arrays;

public class GetIndex {
    public int getIndex(ArrayList<Integer> list, int a) {
        int b = 0;
        for (int i = 0; i < list.size(); i++) {
            if (a == list.get(i)) {
                b = i;
            } else {
                b = -1;
            }
        }
        return b;
    }
}



//Create a function that takes a list and a value, and returns the index of that value in the list.
// If the value is not it the list, the function should return -1.