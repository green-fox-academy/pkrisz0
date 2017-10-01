public class String2{
    public static void main(String[] args) {
        System.out.println(xtoy("MadMaxxxxxx"));
    }

    static String xtoy (String input) {

        /*
        String output = "";
        if (input.length() < 1) {
            return output;
        } else if (input.charAt(0) == 'x') {
            return output = ' ' + xtoy(input.substring(1));
        }
        return output = input.charAt(0) + xtoy(input.substring(1));
        */

        if(input.contains("x")){
            return xtoy(input.replaceFirst("x",""));
        } return input;
    }
}

// Given a string, compute recursively a new string where all the 'x' chars have been removed.

