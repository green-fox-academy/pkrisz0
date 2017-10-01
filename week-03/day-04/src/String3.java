public class String3{
    public static void main(String[] args) {
        System.out.println(xtoy("MadMaxxxxxx"));
    }

    static String xtoy (String input) {
        /*
        String output = "";
        if (input.length() < 1) {
            return output;
        } else if (input.charAt(0) == input.charAt(0)) {
            return output = input.charAt(0) + "*" + xtoy(input.substring(1));
        }
        return output = input.charAt(0) + xtoy(input.substring(1));
        */

        if(input.length() == 1){
            return input;
        } return input.charAt(0) + "*" + xtoy(input.substring(1,input.length()));
    }
}


// Given a string, compute recursively a new string where all the
// adjacent chars are now separated by a "*".