import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {

        System.out.println("How big should the diamond be? ");
        Scanner userInput1 = new Scanner(System.in);
        int size = userInput1.nextInt();

        for(int i = 0; i <= size; i++)
        {
            if(i <= size / 2){
              for(int spaces = size; i < spaces; spaces--)
               {
                System.out.print(" ");
                }
                 for(int stars = 1; stars < i * 2; stars++)
                 {
                   System.out.print("*");
              }
               System.out.println();
            } else {

            }
        }

    }
}



