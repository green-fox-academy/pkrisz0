import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {

        System.out.println("Add a number, i dare you!");
        Scanner userInput1 = new Scanner(System.in);
        int number = userInput1.nextInt();

        //top

        for (int i = 0; i < number; i++) {
            System.out.print("%");
        }
        System.out.println();

        //middle

        String space = "";

        for (int i = 0; i < number - 2; i++) {
            for (int j = 0; j < number - 2; j++) {

                //  diagonal
                if (i == 0) {
                    System.out.println("x");

                    if (j == i) {
                        System.out.print(space + "%");
                        space += " ";
                    }
                }
            }
        }
            //bottom
            for (int i = 0; i < number; i++) {
                System.out.print("%");
            }
            System.out.println();
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

