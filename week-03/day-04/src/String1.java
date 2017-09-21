public class String1{
    public static void main(String[] args) {
        System.out.println(xtoy("MadMaxxxxxx"));
    }

    static String xtoy (String input) {
        String output = "";
        if (input.length() < 1) {
            return output;
        } else if (input.charAt(0) == 'x') {
            return output = 'y' + xtoy(input.substring(1));
        }
        return output = input.charAt(0) + xtoy(input.substring(1));
    }
}

// Given a string, compute recursively (no loops) a new string where all the
// lowercase 'x' chars have been changed to 'y' chars.