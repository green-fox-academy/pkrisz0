import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        System.out.println("Please enter two numbers, and I will print the bigger one!");
       
        Scanner userInputOne = new Scanner(System.in);
        int one = userInputOne.nextInt();
        int two = userInputOne.nextInt();

        if (one > two) {
             System.out.println("The first one was bigger.");
        } else if (one == two){
             System.out.println("You have entered the same number twice -.-");
        } else {
             System.out.println("The second one is bigger.");
        }
    }
}

// Write a program that asks for two numbers and prints the bigger one

