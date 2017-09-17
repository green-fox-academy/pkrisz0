import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        // Modify this program to greet user instead of the World!
        // The program should ask for the name of the user
        
        System.out.println("Hello, User! Please type in your username");

        Scanner username = new Scanner(System.in);
        String userInput1 = username.nextLine();

        System.out.println("Hello," + userInput1 + "!");
    }
}
