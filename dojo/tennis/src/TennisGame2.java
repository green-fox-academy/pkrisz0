public class TennisGame2 implements WinningPoint
{
    public int playerOnePoint = 0;
    public int playerTwoPoint = 0;

    public String playerOneResult = "";
    public String playerTwoResult = "";
    private String playerOneName;
    private String playerTwoName;

    public TennisGame2(String playerOneName, String playerTwoName) {
        this.playerOneName = playerOneName;
        this.playerTwoName = playerTwoName;
    }

    public String getScore(){
        String score = "";
        if (playerOnePoint == playerTwoPoint && playerOnePoint < 4)
        {
            playerOneResult = namePoint(playerOnePoint);
            score += playerOneResult + "-All";
        }
        if (playerOnePoint==playerTwoPoint && playerOnePoint>3)
            score = "Deuce";

        if (playerOnePoint>playerTwoPoint && playerOnePoint < 4)
        {
            playerTwoResult = namePoint(playerTwoPoint);
            playerOneResult = namePoint(playerOnePoint);
            score = playerOneResult + "-" + playerTwoResult;
        }

        if (playerTwoPoint>playerOnePoint && playerTwoPoint < 4)
        {
            playerTwoResult = namePoint(playerTwoPoint);
            playerOneResult = namePoint(playerOnePoint);
            score = playerOneResult + "-" + playerTwoResult;
        }

        if (playerOnePoint > playerTwoPoint && playerTwoPoint >= 3)
        {
            score = "Advantage player1";
        }

        if (playerTwoPoint > playerOnePoint && playerOnePoint >= 3)
        {
            score = "Advantage player2";
        }

        if (playerOnePoint>=4 && playerTwoPoint>=0 && (playerOnePoint-playerTwoPoint)>=2)
        {
            score = "Win for player1";
        }
        if (playerTwoPoint>=4 && playerOnePoint>=0 && (playerTwoPoint-playerOnePoint)>=2)
        {
            score = "Win for player2";
        }
        return score;
    }


    public void increasePlayerOneScore(){
        playerOnePoint++;
    }

    public void increasePlayerTwoScore(){
        playerTwoPoint++;
    }

    public void wonPoint(String player) {
        if (player == "player1")
            increasePlayerOneScore();
        else
            increasePlayerTwoScore();
    }

    public String namePoint(int playerPoint){
        String result = "";
        if (playerPoint==0){
            result = "Love";
        }
        if (playerPoint==1){
            result = "Fifteen";
        }
        if (playerPoint==2){
            result = "Thirty";
        }
        if (playerPoint==3){
            result = "Forty";
        }
        return result;
    }
}