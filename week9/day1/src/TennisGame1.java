import java.util.Objects;

public class TennisGame1 implements TennisGame {

  private int player1Score = 0;
  private int player2Score = 0;
  private String player1;
  private String player2;

  public TennisGame1(String player1, String player2) {
    this.player1 = player1;
    this.player2 = player2;
  }

  public void wonPoint(String player) {
    if (Objects.equals(player, "player1"))
      player1Score++;
    else
      player2Score++;
  }

  public String getScore() {
    String score = "";
    int tempScore = 0;
    if (player1Score == player2Score) {
      if (player1Score == 0) {
        score = "Love-All";
      } else if (player1Score == 1) {
        score = "Fifteen-All";
      } else if (player1Score == 2) {
        score = "Thirty-All";
      } else if (player1Score == 3) {
        score = "Forty-All";
      } else {
        score = "Deuce";
      }
    } else if (player1Score >= 4 || player2Score >= 4) {
      int minusResult = player1Score - player2Score;
      if (minusResult == 1) {
        score = "Advantage player1";
      } else if (minusResult == -1) {
        score = "Advantage player2";
      } else if (minusResult >= 2) {
        score = "Win for player1";
      } else {
        score = "Win for player2";
      }
    } else {
      for (int i = 1; i < 3; i++) {
        if (i == 1) {
          tempScore = player1Score;
        } else {
          score += "-";
          tempScore = player2Score;
        }
        if (tempScore == 0) {
          score += "Love";
        } else if (tempScore == 1) {
          score += "Fifteen";
        } else if (tempScore == 2) {
          score += "Thirty";
        } else if (tempScore == 3) {
          score += "Forty";
        }
      }
    }
    return score;
  }
}
