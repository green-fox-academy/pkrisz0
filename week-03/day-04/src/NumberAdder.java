public class NumberAdder{
    public static void main(String[] args) {
        System.out.println(numberAdder(5));
    }
    static int numberAdder(int input) {
        if (input == 1){
            return 1;
        } return input + numberAdder(input - 1);
    }
}




// Write a recursive function that takes one parameter: n and adds numbers from 1 to n.