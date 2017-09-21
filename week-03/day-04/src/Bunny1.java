public class Bunny1{
    public static void main(String[] args) {
        System.out.println(bunnies(16));
    }
    static int bunnies (int bunnycount) {
        if (bunnycount == 1){
            return 2;
        } return 2 + bunnies(bunnycount-1);
    }
}

// We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).

