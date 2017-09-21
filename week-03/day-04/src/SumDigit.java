public class SumDigit {
    public static void main(String[] args) {
        System.out.println("function result " + sumDigit(391));
    }

    static int sumDigit (int input) {

        if (input % 10 == input) {
            return input;
        } return (input % 10) + sumDigit(input / 10);
    }
}

// Given a non-negative int n, return the sum of its digits recursively (no loops).
// Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while 
// divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

/*    how to get the digits
    int a = 1267;
    int b = a % 10;
    int c = a / 10 % 10;
    int d = a / 10 / 10 % 10;
    int e = a / 10 / 10 / 10 % 10;
*/
