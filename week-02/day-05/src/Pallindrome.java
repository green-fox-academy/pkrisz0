public class Pallindrome {
    public static void main(String[] args) {

        createpallindrome("123");
    }

    public static void createpallindrome(String inputone) {

        String reversed = "";

        for(int i = inputone.length() - 1; i >= 0 ; i--){
            char dummy = inputone.charAt(i);
            reversed = reversed.concat(String.valueOf(dummy));
        }
        System.out.println(inputone.concat(reversed));
    }
}

