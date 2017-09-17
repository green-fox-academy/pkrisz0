import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        System.out.println("How big should the pyramid be? ");
        Scanner userInput1 = new Scanner(System.in);
        int size = userInput1.nextInt();

        for(int i = 0; i <= size; i++)
        {
            for(int spaces = size; i < spaces; spaces--)
            {
                System.out.print(" ");
            }
            for(int stars = 1; stars < i * 2; stars++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



// Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was
