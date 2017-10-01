import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {

        Scanner diagonalScanner = new Scanner(System.in);
        System.out.println("please enter a number");
        int entered = diagonalScanner.nextInt();

        int[] dimension = new int[entered];

        for (int i = 0; i < dimension.length; i++) {
            dimension[i] = i;
        }

        for (int i = 1; i <= entered; i++) {
            System.out.print(dimension);
        }
        System.out.println();


        for (int i = 1; i <= entered; i++) {
            System.out.print("%");
        }

    }
}

// Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%
// %%  %
// % % %
// %  %%
// %%%%%
//
// The square should have as many lines as the number was

