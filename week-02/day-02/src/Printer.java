public class Printer {
    public static void main(String[] args) {
        printer("not", "sure", "i got this correct");
    }

    public static void printer(String... input){
        for(String i: input)
        System.out.println(i);
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