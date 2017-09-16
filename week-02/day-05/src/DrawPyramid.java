import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {

        System.out.println("How big should the pyramid be? ");
        Scanner userInput1 = new Scanner(System.in);
        int size = userInput1.nextInt();

        int spaces = size - 1;

        int stars = 1;

        for(int i = 0;i < size;i++)
        {
            for(int j = 0;j < spaces;j++)
            {
                System.out.print(" ");
            }
            for(int  k = 0; k < stars ;k++)
            {
                System.out.print("*");
            }
            spaces-- ;
            stars = stars + 2;
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
