public class Counter{
    public static void main(String[] args) {
        counter(5);
    }
    static int counter (int input) {
        System.out.println(input);
        if (input == 0){
            return 0;
        } return counter(input - 1);
    }
}

// Write a recursive function that takes one parameter: n and counts down from n.

