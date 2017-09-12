public class Printer {
    public static void main(String[] args) {
        printer("not", "sure", "i got this correct");
    }

    public static void printer(String first,String second, String third){
        System.out.println("\""+first+"\", "+"\""+second+"\", "+"\""+third+"\"");
    }
}




//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `printer`
//   which prints the input String parameters
// - It can have any number of parameters

// Examples
// printer("first")
// printer("first", "second")
// printer("first", "second", "third", "fourh")
// ...