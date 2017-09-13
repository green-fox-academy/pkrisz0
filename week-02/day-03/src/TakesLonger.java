public class TakesLonger {
    public static void main(String[] args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        //positive lookaround for the win!!! will totally demo this

        String[] parts = quote.split("(?<=t )",2);

        String partone = parts[0];
        String parttwo = parts[1];

        String addition = "always takes longer than";

        String fin = partone.concat(addition.concat(parttwo));

        System.out.println(fin);
    }
}

// When saving this quote a disk error has occured. Please fix it.
// Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
// Using pieces of the quote variable (instead of just redefining the string)
