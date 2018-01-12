import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentCounter {
    public static void main(String[] args) {
        ArrayList<Map<String, Object>> map = new ArrayList<Map<String, Object>>();

        // Given this list of hashmaps...

        Map<String, Object> row0 = new HashMap<String, Object>();
        row0.put("name", "Rezso");
        row0.put("age", 9.5);
        row0.put("candies", 2);
        map.add(row0);

        Map<String, Object> row1 = new HashMap<String, Object>();
        row1.put("name", "Gerzson");
        row1.put("age", 10);
        row1.put("candies", 1);
        map.add(row1);

        Map<String, Object> row2 = new HashMap<String, Object>();
        row2.put("name", "Aurel");
        row2.put("age", 7);
        row2.put("candies", 3);
        map.add(row2);

        Map<String, Object> row3 = new HashMap<String, Object>();
        row3.put("name", "Zsombor");
        row3.put("age", 12);
        row3.put("candies", 5);
        map.add(row3);

        Map<String, Object> row4 = new HashMap<String, Object>();
        row4.put("name", "Olaf");
        row4.put("age", 12);
        row4.put("candies", 7);
        map.add(row4);

        Map<String, Object> row5 = new HashMap<String, Object>();
        row5.put("name", "Teodor");
        row5.put("age", 3);
        row5.put("candies", 2);
        map.add(row5);

        // candies
        System.out.println(moreThanFourCandies(map));
        System.out.println(lessThanFive(map));

    }

    public static List<String> moreThanFourCandies(ArrayList<Map<String, Object>> input){
        List<String> names = new ArrayList<>();
        for (int i = 0; i < input.size(); i++) {
            if ((int)input.get(i).get("candies") > 4){
                names.add((String) input.get(i).get("name"));
            }
        }
        return names;
    }

    public static double lessThanFive(ArrayList<Map<String, Object>> input){
        double ageSum = 0;
        for (int i = 0; i < input.size(); i++) {
            if ( Double.valueOf(String.valueOf(input.get(i).get("age")))< 5){
                ageSum += (int)input.get(i).get("age");
            }
        }
        return ageSum;
    }
}

// Display the following things:
//  - Who has got more than 4 candies
//  - Sum the age of people who have lass than 5 candies