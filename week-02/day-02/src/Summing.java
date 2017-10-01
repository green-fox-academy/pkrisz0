public class Summing {
    public static void main(String[] args) {
        System.out.println(sum(5));
    }

    public static int sum(int input){
        int summa = 0;
        for (int i = 0; i < input; i++){
             summa += i;
        }
        return summa;
    }
}

//  Create the usual class wrapper
//  and main method on your own.

// - Write a function called `sum` that sum all the numbers
//   until the given parameter