package method;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int highScorePosition = calculateHighScore(1500);
        displayHighScorePosition("suhil", highScorePosition);

        highScorePosition = calculateHighScore(900);
        displayHighScorePosition("arpil", highScorePosition);
        highScorePosition = calculateHighScore(400);
        displayHighScorePosition("rucha", highScorePosition);
        highScorePosition = calculateHighScore(50);
        displayHighScorePosition("shreya", highScorePosition);

    }

    public static void displayHighScorePosition(String playerName, int HighScorePosition) {
        System.out.println(playerName + " managed to get into Position " + HighScorePosition + " on the high score table");
    }

    public static int calculateHighScore(int playerScore) {
        if (playerScore > 1000) {
            return 1;
        } else if (playerScore < 1000 && playerScore > 500) {
            return 2;
        } else if (playerScore < 500 && playerScore > 100) {
            return 3;
        } else {
            return 4;
        }
    }

}

