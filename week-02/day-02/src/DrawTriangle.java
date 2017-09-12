import java.util.Scanner;

public class DrawTriangle {
    public static void main (String[] args) {
        System.out.println("Please enter a random number:");
        Scanner number = new Scanner(System.in);
        int numberadd = number.nextInt();

        for(int i = 1; i <= numberadd; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
           System.out.println();
        }
    }
}
