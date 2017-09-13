public class ToDoPrint {
    public static void main(String[] args) {
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        char[] letters = new char[reversed.length()];

        for(int i = 0; i < reversed.length(); i++){
            letters[i] = reversed.charAt(i);
        }

        for(int i = 0; i < reversed.length(); i++) {
            System.out.print(letters[(letters.length - 1) - i]);
        }
    }
}

// Create a function that can reverse a String, which is passed as the parameter
// Use it on this reversed string to check it!
// Try to solve this using charAt() first, and optionally anything else after.

