public class Power {
    public static void main(String[] args) {
        System.out.println(power(3,3));
    }
    static int power(int base, int n) {
        if(n == 1){
            return base;
        } return base * power(base, n-1);
    }
}

// Given base and n that are both 1 or more, compute recursively (no loops)
// the value of base to the n power, so powerN(3, 2) is 9 (3 squared).

/*
n = 1  base
n = 2  base * base
n = 3  base * base * base
*/
