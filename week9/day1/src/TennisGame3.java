public class TennisGame3 implements TennisGame {

  private int player1;
  private int player2;
  private String player1Name;
  private String player2Name;

  public TennisGame3(String player1Name, String player2Name) {
    this.player1Name = player1Name;
    this.player2Name = player2Name;
  }

  public String getScore() {
    String score;
    if (player1 < 4 && player2 < 4) {
      String[] playerScore = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
      score = playerScore[player1];
      if (player1 == player2) {
        return score + "-All";
      } else {
        return score + "-" + playerScore[player2];
      }
    } else {
      if (player1 == player2) {
        return "Deuce";
      }
      if (player1 > player2) {
        score = player1Name;
      } else {
        score = player2Name;
      }
      if ((player1 - player2) * (player1 - player2) == 1) {
        return "Advantage " + score;
      } else return "Win for " + score;
    }
  }

  public void wonPoint(String player) {
    if (player == "player1")
      this.player1 ++;
    else
      this.player2 ++;

  }

}
