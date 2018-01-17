package codewars;

public class RockPaperSciss {
    public static void main(String[] args) {
        game("scissors", "rock");
    }

    public static String game(String p1, String p2){
        String outcome;

        if (p1 == "rock" & p2 == "scissors" || p1 == "paper" & p2 == "rock" || p1 == "scissors" & p2 == "paper"){
            outcome = "Player 1 won!";
        } else if (p2 == "rock" & p1 == "scissors" || p2 == "paper" & p1 == "rock" || p2 == "scissors" & p1 == "paper"){
            outcome = "Player 2 won!";
        } else {
            outcome = "Draw!";
        }

        return outcome;
    }
}
