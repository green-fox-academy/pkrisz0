import java.util.ArrayList;

public class Reverse_2 {
    public static void main(String[] args) {
        magicalReverser(".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI");

    }

    public static void magicalReverser(String reversed){

        String[] dummy = reversed.split("");

        ArrayList<String> characters = new ArrayList<String>();

        for (int i = reversed.length() - 1; i >= 0; i--) {
            characters.add(dummy[i]);

        }

        System.out.println();
        System.out.println();

        System.out.println(characters);

        System.out.println();
        System.out.println();

        reversed = characters.toString().replaceAll(", |\\[|]", "");


        System.out.print(reversed);
        System.out.println();
        System.out.println();

    }
}

// Create a function that can reverse a String, which is passed as the parameter
// Use it on this reversed string to check it!
// Try to solve this using charAt() first, and optionally anything else after.

