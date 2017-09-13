public class Reverse {
    public static void main(String[] args) {
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        // solution 1
        char[] letters = new char[reversed.length()];

        for(int i = 0; i < reversed.length(); i++){
            letters[i] = reversed.charAt(i);
        }

        String dummytwo = "";

        for(int i = reversed.length() - 1; i > 0 ; i--) {
             char dummy = (letters[i]);
             dummytwo = dummytwo.concat(String.valueOf(dummy));
        }

        reversed = dummytwo;

        System.out.println(reversed);

    }
}

// Create a function that can reverse a String, which is passed as the parameter
// Use it on this reversed string to check it!
// Try to solve this using charAt() first, and optionally anything else after.

