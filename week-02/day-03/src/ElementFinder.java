import java.util.ArrayList;
import java.util.Arrays;

public class ElementFinder {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));

        // Solution #1
        if (arrayList.contains(7) == true){
            System.out.println("Hooray");
        } else {
            System.out.println("Noooooo");
        }


        //Solution #2
        
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) == 7){
                System.out.println("Hooray");
            } else{
                System.out.println("Noooooo");
            }

        }
    }
}

// Check if the arrayList contains "7" if it contains print "Hoorray" otherwise print "Noooooo"
// Do this again with a different solution using different list functions!

