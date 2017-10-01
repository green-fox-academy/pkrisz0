import java.util.Arrays;
import java.util.List;

public class Bunny2{
    public static void main(String[] args) {
        System.out.println(ears(4));
    }

    public static int ears(int count){
        if(count == 1) {
            return 2;
        } else if (count % 2 == 0) {       //ha paros
            return  3 + ears(count-1);
        } else {                           // ha paratlan
            return 2 + ears(count-1);
        }
    }
}

// We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
// (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
// have 3 ears, because they each have a raised foot. Recursively return the
// number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

/*
bunnyno.  ears
1   2
2   (5) 2+3 if even add 3
3   (7) 2+3+2 if odd add 2
4   (10) 2+3+2+3
*/

