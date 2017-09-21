public class Counter{
    public static void main(String[] args) {
        System.out.println(counter(5));
    }
    static int counter (int input) {
        if (input == 1){
            return 1;
        } return input + counter(input - 1);
    }
}

// Write a recursive function that takes one parameter: n and counts down from n.

