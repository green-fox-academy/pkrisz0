import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {

        System.out.println("Add a number, i dare you!");
        Scanner userInput1 = new Scanner(System.in);
        int number = userInput1.nextInt();

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if(j == 0){
                    System.out.print("%");
                } else if(i == 0){
                    System.out.print("%");
                } else if(i == number - 1){
                    System.out.print("%");
                } else if(j == number - 1){
                    System.out.print("%");
                } else if(j == i){
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
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

